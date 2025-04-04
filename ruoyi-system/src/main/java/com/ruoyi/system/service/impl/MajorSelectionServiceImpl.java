package com.ruoyi.system.service.impl;


import com.alibaba.fastjson2.JSONObject;
import com.ruoyi.system.service.websocket.WebSocketUsers;
import com.ruoyi.system.domain.StuMajor;
import com.ruoyi.system.domain.dto.MajorStatisticDTO;
import com.ruoyi.system.mapper.StuMajorMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class MajorSelectionServiceImpl {

    @Autowired
    private StuMajorMapper majorMapper;

    @Autowired
    private StrategyFactory strategyFactory;

    public List<StuMajor> getAvailableMajors(@RequestParam("major") String major,
                                             @RequestParam("academy") String academy,
                                             @RequestParam("innovationStatus") Integer innovationStatus,
                                             @RequestParam("policyStatus") Integer policyStatus) {
        System.out.println(111 + "major: " + major + " academy: " + academy + " innovationStatus: " + innovationStatus + " policyStatus: " + policyStatus);
        return strategyFactory.getStrategy(innovationStatus, policyStatus)
                .getAvailableMajors(major, academy);
    }

    @Transactional(rollbackFor = Exception.class)
    public List<JSONObject> getEveryMajorCount(Integer parentId, Integer majorId , boolean isTell) {
        List<JSONObject> result = new ArrayList<>();
        List<MajorStatisticDTO> majorStatistics = majorMapper.selectMajorStatisticGradesNum(parentId);
        if (!isTell) {

            // 初始化统计变量
            AtomicInteger fatherACount = new AtomicInteger(0);
            AtomicInteger fatherBCount = new AtomicInteger(0);
            AtomicInteger fatherCCount = new AtomicInteger(0);
            AtomicInteger fatherTotal = new AtomicInteger(0);

            // 批量处理子专业
            List<MajorStatisticDTO> updateList = majorStatistics.stream()
                    .peek(dto -> {
                        // 累加父级数据
                        fatherACount.addAndGet(dto.getGradeA());
                        fatherBCount.addAndGet(dto.getGradeB());
                        fatherCCount.addAndGet(dto.getGradeC());
                        fatherTotal.addAndGet(dto.getStudentNum());

                        // 构建响应数据
                        JSONObject json = new JSONObject();
                        json.put("majorName", dto.getMajorName());
                        json.put("countA", dto.getGradeA());
                        json.put("countB", dto.getGradeB());
                        json.put("countC", dto.getGradeC());
                        json.put("count", dto.getStudentNum());
                        result.add(json);


                    })
                    .collect(Collectors.toList());

            // 批量更新子专业
            majorMapper.batchUpdateMajors(updateList);

            // 更新父级数据
            majorMapper.updateStuMajor(
                    parentId,
                    fatherACount.get(),
                    fatherBCount.get(),
                    fatherCCount.get(),
                    fatherTotal.get()
            );
        } else {
            System.out.println("majorStatistics: " + majorStatistics);
            // 创建包含详细数据的消息列表
            List<JSONObject> messages = majorStatistics.stream()
                    .map(dto -> new JSONObject()
                            .fluentPut("type", "student_update")
                            .fluentPut("majorId", dto.getMajorId())
                            .fluentPut("majorName", dto.getMajorName())
                            .fluentPut("gradeA", dto.getGradeA())
                            .fluentPut("gradeB", dto.getGradeB())
                            .fluentPut("gradeC", dto.getGradeC())
                            .fluentPut("total", dto.getStudentNum()))
                    .collect(Collectors.toList());
            // 发送消息
            // 异步发送WebSocket消息
            CompletableFuture.runAsync(() -> {
                messages.forEach(message ->
//                        WebSocketUsers.sendMessageToUsersByText(message.toJSONString())
                        // 发送给所有客户端（包括自己）
                        WebSocketUsers.sendMessageToAll(message.toJSONString())
                );
                // 或者批量发送（根据前端处理能力选择）
//                 WebSocketUsers.sendMessageToUsersByText(messages.toJSONString());
            });
        }
        return result;
    }
}