package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 试题管理对象 questions
 * 
 * @author ruoyi
 * @date 2024-12-27
 */
public class Questions extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long questionnaireId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String text;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long orderIndex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long nextQuestionId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setQuestionnaireId(Long questionnaireId) 
    {
        this.questionnaireId = questionnaireId;
    }

    public Long getQuestionnaireId() 
    {
        return questionnaireId;
    }
    public void setText(String text) 
    {
        this.text = text;
    }

    public String getText() 
    {
        return text;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setOrderIndex(Long orderIndex) 
    {
        this.orderIndex = orderIndex;
    }

    public Long getOrderIndex() 
    {
        return orderIndex;
    }
    public void setNextQuestionId(Long nextQuestionId) 
    {
        this.nextQuestionId = nextQuestionId;
    }

    public Long getNextQuestionId() 
    {
        return nextQuestionId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("questionnaireId", getQuestionnaireId())
            .append("text", getText())
            .append("type", getType())
            .append("orderIndex", getOrderIndex())
            .append("nextQuestionId", getNextQuestionId())
            .toString();
    }
}
