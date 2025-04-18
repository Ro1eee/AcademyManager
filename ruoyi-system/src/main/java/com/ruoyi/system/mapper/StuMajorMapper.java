package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.StuMajor;
import com.ruoyi.system.domain.dto.MajorStatistic;
import com.ruoyi.system.domain.dto.MajorStatisticDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuMajorMapper {
    List<StuMajor> selectByAcademyAndType(
            @Param("major") String major,
            @Param("academy") String academy,
            @Param("type") Integer type
    );

    List<MajorStatisticDTO> selectMajorStatisticGradesNum(
            @Param("parentId") Integer parentId,
            @Param("divertForm") String divertForm
    );
    void updateRankedStudents(@Param("academy") List<String> academy);
    /**
     * 根据学生ID列表获取所属专业ID（去重）
     * @param studentIds 学生ID列表
     * @return 专业ID列表
     */
    List<String> selectDistinctMajorIdsByStudents(
            @Param("studentIds") List<String> studentIds
    );
    public void updateStuMajor(@Param("majorId") Integer majorId,
                               @Param("gradeA") Integer gradeA,
                               @Param("gradeB") Integer gradeB,
                               @Param("gradeC") Integer gradeC,
                               @Param("studentNum") Integer studentNum);
    // 新增批量更新方法
    void batchUpdateMajors(@Param("list") List<MajorStatisticDTO> updateList);

    List<MajorStatisticDTO> getMajorStatisticGradesNum(
            @Param("parentId") Integer parentId);
    //得到所有专业人数
    List<MajorStatistic> getMajorNum();
}