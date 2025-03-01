package com.ruoyi.system.domain.dto;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class StuCompetitionRecord {
    private Integer competitionId; // 主键ID
    private String studentId; // 学号
    private String competitionName; // 竞赛名称
    private String competitionLevel; // 竞赛级别
    private String awardLevel; // 竞赛奖项
    private Integer scholarshipPoints; // 折合分数
    private Date awardDate; // 获奖日期

    public String getProofMaterialBase64() {
        return proofMaterialBase64;
    }

    public void setProofMaterialBase64(String proofMaterialBase64) {
        this.proofMaterialBase64 = proofMaterialBase64;
    }

    private String proofMaterialBase64; // Base64 格式的图片数据

    private byte[] proofMaterial; // 证明材料
    private String auditStatus = "未审核"; // 审核状态


    private LocalDateTime applyTime; // 提交时间
    private String nickName; // 审核人姓名
    private Date auditTime; // 审核时间
    private String auditRemark; // 审核意见
    private String semester; // 修读学期
    private String studentName;//学生姓名

    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCompetitionLevel() {
        return competitionLevel;
    }

    public void setCompetitionLevel(String competitionLevel) {
        this.competitionLevel = competitionLevel;
    }

    public String getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel;
    }

    public Integer getScholarshipPoints() {
        return scholarshipPoints;
    }

    public void setScholarshipPoints(Integer scholarshipPoints) {
        this.scholarshipPoints = scholarshipPoints;
    }

    public Date getAwardDate() {
        return awardDate;
    }

    public void setAwardDate(Date awardDate) {
        this.awardDate = awardDate;
    }


    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public byte[] getProofMaterial() {
        return proofMaterial;
    }

    public void setProofMaterial(byte[] proofMaterial) {
        this.proofMaterial = proofMaterial;
    }
    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }


    @Override
    public String toString() {
        return "StuCompetitionRecord{" +
                "competitionId=" + competitionId +
                ", studentId='" + studentId + '\'' +
                ", competitionName='" + competitionName + '\'' +
                ", competitionLevel='" + competitionLevel + '\'' +
                ", awardLevel='" + awardLevel + '\'' +
                ", scholarshipPoints=" + scholarshipPoints +
                ", awardDate=" + awardDate +
                ", proofMaterialBase64='" + proofMaterialBase64 + '\'' +
                ", proofMaterial=" + Arrays.toString(proofMaterial) +
                ", auditStatus='" + auditStatus + '\'' +
                ", applyTime=" + applyTime +
                ", nickName='" + nickName + '\'' +
                ", auditTime=" + auditTime +
                ", auditRemark='" + auditRemark + '\'' +
                ", semester='" + semester + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
