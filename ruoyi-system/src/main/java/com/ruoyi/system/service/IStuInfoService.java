package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.StuInfo;

/**
 * 学生信息Service接口
 *
 * @author ruoyi
 * @date 2025-03-27
 */
public interface IStuInfoService
{


    /**
     * 查询学生信息列表
     *
     * @param stuInfo 学生信息
     * @return 学生信息集合
     */
    public List<StuInfo> selectStuInfoList(StuInfo stuInfo);

    /**
     * 新增学生信息
     *
     * @param stuInfo 学生信息
     * @return 结果
     */
    public int insertStuInfo(StuInfo stuInfo);

    /**
     * 修改学生信息
     *
     * @param stuInfo 学生信息
     * @return 结果
     */
    public int updateStuInfo(StuInfo stuInfo);

    /**
     * 批量删除学生信息
     *
     * @param ids 需要删除的学生信息主键集合
     * @return 结果
     */
    public int deleteStuInfoByIds(Long[] ids);

    /**
     * 删除学生信息信息
     *
     * @param id 学生信息主键
     * @return 结果
     */
    public int deleteStuInfoById(Long id);
    /**
     * 查询学生信息
     *
     * @param studentId 学生信息主键
     * @return 学生信息
     */
    public StuInfo getStudentInfoById(String studentId);
    List<StuInfo> getStudentChangeMajorInfo(StuInfo stuInfo);

}
