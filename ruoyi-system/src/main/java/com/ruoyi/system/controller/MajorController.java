package com.ruoyi.system.controller;


import com.alibaba.fastjson2.JSONObject;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.StuMajor;
import com.ruoyi.system.service.impl.MajorSelectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system/major")
public class MajorController extends BaseController {

    @Autowired
    private MajorSelectionServiceImpl selectionService;

    @GetMapping("/tree")
    public AjaxResult getMajorTree(
            @RequestParam("major") String major,
            @RequestParam("academy") String academy,
            @RequestParam(name = "innovationStatus", defaultValue = "0") Integer innovationStatus,
            @RequestParam(name = "policyStatus", defaultValue = "0") Integer policyStatus
    ) {

        System.out.println("major: " + major + " academy: " + academy + " innovationStatus: " + innovationStatus + " policyStatus: " + policyStatus);
        return success(
                selectionService.getAvailableMajors(major, academy, innovationStatus, policyStatus)
        );
    }
    /**
     * 获取专业人数统计
     * @param majorId 专业ID (必填)
     * @param isTell 分流来源 (必填)
     * @return 统计结果 {major_name: "专业名", count: 人数}
     */
    @GetMapping("/count")
    public AjaxResult getEveryMajorCount(
            @RequestParam(value = "parent_id", required = true) String parentId,
            @RequestParam(value = "major_id", required = false, defaultValue = "0") String majorId,
            @RequestParam(value = "is_tell", required = true) boolean isTell
    ) {
        try {
            int parsedParentId = Integer.parseInt(parentId);
            int parsedMajorId = Integer.parseInt(majorId);
            return success(
                    selectionService.getEveryMajorCount(parsedParentId,parsedMajorId,isTell)
            );
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("专业ID必须为数字");
        }
    }

}