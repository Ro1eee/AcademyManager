package com.ruoyi.system.domain;

import lombok.Data;

import java.util.List;

@Data
public class StuMajor {
    private Long majorId;
    private String majorName;
    private String academy;
    private Integer type;        // 专业类型
    private Long parentId;       // 父级ID
    private List<StuMajor> children; // 树形结构子节点
    private Integer studentNum; // 专业人数
    private Integer originalStudentNum; // 初始专业人数
    private Integer gradeA; // 成绩A人数
    private Integer gradeB; // 成绩B人数
    private Integer gradeC; // 成绩C人数
}
