package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StuActivityRecord;


public interface StuActivityRecordMapper
{
    /**
     * 查询学生文体活动记录
     *
     * @param activityId 学生文体活动记录主键
     * @return 学生文体活动记录
     */
    public StuActivityRecord selectStuActivityRecordByActivityId(Integer activityId);

    /**
     * 查询学生文体活动记录列表
     *
     * @param stuActivityRecord 学生文体活动记录
     * @return 学生文体活动记录集合
     */
    public List<StuActivityRecord> selectStuActivityRecordList(StuActivityRecord stuActivityRecord);

    /**
     * 新增学生文体活动记录
     *
     * @param stuActivityRecord 学生文体活动记录
     * @return 结果
     */
    public int insertStuActivityRecord(StuActivityRecord stuActivityRecord);

    /**
     * 修改学生文体活动记录
     *
     * @param stuActivityRecord 学生文体活动记录
     * @return 结果
     */
    public int updateStuActivityRecord(StuActivityRecord stuActivityRecord);

    /**
     * 删除学生文体活动记录
     *
     * @param activityId 学生文体活动记录主键
     * @return 结果
     */
    public int deleteStuActivityRecordByActivityId(Integer activityId);

    /**
     * 批量删除学生文体活动记录
     *
     * @param activityIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStuActivityRecordByActivityIds(Integer[] activityIds);
}
