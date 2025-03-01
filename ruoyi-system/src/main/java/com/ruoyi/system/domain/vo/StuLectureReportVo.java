package com.ruoyi.system.domain.vo;

import java.time.LocalDateTime;

public class StuLectureReportVo {
    /**
     * 学生学号
     */
    private String studentId;
    /**
     * 学生姓名
     */
    private String studentName;
    /**
     * 题目
     */
    private String reportTitle;
    /**
     * 报告人
     */
    private String reporter;
    /**
     * 报告时间
     */
    private LocalDateTime reportDate;
    /**
     * 报告提交时间
     */
    private LocalDateTime reportAdmitTime;
    /**
     * 内容简介
     */
    private String reportContent;
    /**
     * 链接
     */
    private String reportLink;
    /**
     *报告心得体会
     */
    private byte[] reportFeeling;
    /**
     * 图片
     */
    private byte[] reportPicture;
    /**
     * 审核状态
     */
    private int auditStatus = 0;
    /**
     *审核时间
     */
    private LocalDateTime auditTime;
    /**
     * 审核意见
     */
    private String auditRemark;
    /**
     * 审核人姓名
     */
    private String nickName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public LocalDateTime getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }

    public LocalDateTime getReportAdmitTime() {
        return reportAdmitTime;
    }

    public void setReportAdmitTime(LocalDateTime reportAdmitTime) {
        this.reportAdmitTime = reportAdmitTime;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getReportLink() {
        return reportLink;
    }

    public void setReportLink(String reportLink) {
        this.reportLink = reportLink;
    }

    public byte[] getReportFeeling() {
        return reportFeeling;
    }

    public void setReportFeeling(byte[] reportFeeling) {
        this.reportFeeling = reportFeeling;
    }

    public byte[] getReportPicture() {
        return reportPicture;
    }

    public void setReportPicture(byte[] reportPicture) {
        this.reportPicture = reportPicture;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public LocalDateTime getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(LocalDateTime auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
