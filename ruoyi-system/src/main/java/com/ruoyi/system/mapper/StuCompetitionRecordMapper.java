package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StuCompetitionRecord;

/**
 * 学生科创竞赛记录Mapper接口
 *
 * @author ruoyi
 * @date 2025-03-07
 */
public interface StuCompetitionRecordMapper
{
    /**
     * 查询学生科创竞赛记录
     *
     * @param competitionId 学生科创竞赛记录主键
     * @return 学生科创竞赛记录
     */
    public StuCompetitionRecord selectStuCompetitionRecordByCompetitionId(Integer competitionId);

    /**
     * 查询学生科创竞赛记录列表
     *
     * @param stuCompetitionRecord 学生科创竞赛记录
     * @return 学生科创竞赛记录集合
     */
    public List<StuCompetitionRecord> selectStuCompetitionRecordList(StuCompetitionRecord stuCompetitionRecord);

    /**
     * 新增学生科创竞赛记录
     *
     * @param stuCompetitionRecord 学生科创竞赛记录
     * @return 结果
     */
    public int insertStuCompetitionRecord(StuCompetitionRecord stuCompetitionRecord);

    /**
     * 修改学生科创竞赛记录
     *
     * @param stuCompetitionRecord 学生科创竞赛记录
     * @return 结果
     */
    public int updateStuCompetitionRecord(StuCompetitionRecord stuCompetitionRecord);

    /**
     * 删除学生科创竞赛记录
     *
     * @param competitionId 学生科创竞赛记录主键
     * @return 结果
     */
    public int deleteStuCompetitionRecordByCompetitionId(Integer competitionId);

    /**
     * 批量删除学生科创竞赛记录
     *
     * @param competitionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStuCompetitionRecordByCompetitionIds(Integer[] competitionIds);
}
