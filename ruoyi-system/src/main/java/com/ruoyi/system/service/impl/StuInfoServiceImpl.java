package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StuInfoMapper;
import com.ruoyi.system.domain.StuInfo;
import com.ruoyi.system.service.IStuInfoService;

/**
 * 学生信息Service业务层处理
 *
 * @author ruoyi
 * @date 2025-03-27
 */
@Service
public class StuInfoServiceImpl implements IStuInfoService
{
    @Autowired
    private StuInfoMapper stuInfoMapper;

    

    /**
     * 查询学生信息列表
     *
     * @param stuInfo 学生信息
     * @return 学生信息
     */
    @Override
    public List<StuInfo> selectStuInfoList(StuInfo stuInfo)
    {
        return stuInfoMapper.selectStuInfoList(stuInfo);
    }

    /**
     * 新增学生信息
     *
     * @param stuInfo 学生信息
     * @return 结果
     */
    @Override
    public int insertStuInfo(StuInfo stuInfo)
    {
        return stuInfoMapper.insertStuInfo(stuInfo);
    }

    /**
     * 修改学生信息
     *
     * @param stuInfo 学生信息
     * @return 结果
     */
    @Override
    public int updateStuInfo(StuInfo stuInfo)
    {
        return stuInfoMapper.updateStuInfo(stuInfo);
    }

    /**
     * 批量删除学生信息
     *
     * @param ids 需要删除的学生信息主键
     * @return 结果
     */
    @Override
    public int deleteStuInfoByIds(Long[] ids)
    {
        return stuInfoMapper.deleteStuInfoByIds(ids);
    }

    /**
     * 删除学生信息信息
     *
     * @param id 学生信息主键
     * @return 结果
     */
    @Override
    public int deleteStuInfoById(Long id)
    {
        return stuInfoMapper.deleteStuInfoById(id);
    }
    /**
     * 查询学生信息
     *
     * @param studentId 学生信息主键
     * @return 学生信息
     */
    @Override
    public StuInfo getStudentInfoById(String studentId) {
        return stuInfoMapper.selectStuInfoById(studentId);
    }

    @Override
    public List<StuInfo> getStudentChangeMajorInfo(StuInfo stuInfo) {
        return stuInfoMapper.getStudentChangeMajorInfo(stuInfo);
    }
}
