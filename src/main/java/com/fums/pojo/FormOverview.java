package com.fums.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fums.pojo.FollowUp;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * form_overview
 * @author 
 */
public class FormOverview implements Serializable {
    private Integer overviewId;

    /**
     * 科室id
     */
    private Integer departmentId;

    /**
     * 随访组ID
     */
    private Integer followupUpId;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 更新日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatedDate;

    /**
     * 更新者
     */
    private String updateThe;

    /**
     * 版本号
     */
    private String theErsionUmber;

    /**
     * 创建者
     */
    private String theReator;

    /**
     * 创建日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;

    /**
     * 状态（0：历史版本 1：当前版本 2；未发布）
     */
    private String state;

    /**
     * 表状态(1:删除，2:未删除)
     */
    private String tableState;

    private FollowUp followUp;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "FormOverview{" +
                "overviewId=" + overviewId +
                ", departmentId=" + departmentId +
                ", followupUpId=" + followupUpId +
                ", templateName='" + templateName + '\'' +
                ", updatedDate=" + updatedDate +
                ", updateThe='" + updateThe + '\'' +
                ", theErsionUmber='" + theErsionUmber + '\'' +
                ", theReator='" + theReator + '\'' +
                ", creationDate=" + creationDate +
                ", state='" + state + '\'' +
                ", tableState='" + tableState + '\'' +
                ", followUp=" + followUp +
                '}';
    }

    public Integer getOverviewId() {
        return overviewId;
    }

    public void setOverviewId(Integer overviewId) {
        this.overviewId = overviewId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getFollowupUpId() {
        return followupUpId;
    }

    public void setFollowupUpId(Integer followupUpId) {
        this.followupUpId = followupUpId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdateThe() {
        return updateThe;
    }

    public void setUpdateThe(String updateThe) {
        this.updateThe = updateThe;
    }

    public String getTheErsionUmber() {
        return theErsionUmber;
    }

    public void setTheErsionUmber(String theErsionUmber) {
        this.theErsionUmber = theErsionUmber;
    }

    public String getTheReator() {
        return theReator;
    }

    public void setTheReator(String theReator) {
        this.theReator = theReator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTableState() {
        return tableState;
    }

    public void setTableState(String tableState) {
        this.tableState = tableState;
    }

    public FollowUp getFollowUp() {
        return followUp;
    }

    public void setFollowUp(FollowUp followUp) {
        this.followUp = followUp;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}