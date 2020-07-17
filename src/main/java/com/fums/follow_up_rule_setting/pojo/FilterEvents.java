package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * filter_events
 * @author 
 */
public class FilterEvents implements Serializable {
    /**
     * 筛选事件id
     */
    private Integer id;

    /**
     * （1：本院2：本科室）
     */
    private Integer department;

    /**
     * (1：首次2：末次)
     */
    private Integer firstAndLast;

    /**
     * （1：本就诊2：任意就诊）
     */
    private Integer anyVisit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getFirstAndLast() {
        return firstAndLast;
    }

    public void setFirstAndLast(Integer firstAndLast) {
        this.firstAndLast = firstAndLast;
    }

    public Integer getAnyVisit() {
        return anyVisit;
    }

    public void setAnyVisit(Integer anyVisit) {
        this.anyVisit = anyVisit;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FilterEvents other = (FilterEvents) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getFirstAndLast() == null ? other.getFirstAndLast() == null : this.getFirstAndLast().equals(other.getFirstAndLast()))
            && (this.getAnyVisit() == null ? other.getAnyVisit() == null : this.getAnyVisit().equals(other.getAnyVisit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getFirstAndLast() == null) ? 0 : getFirstAndLast().hashCode());
        result = prime * result + ((getAnyVisit() == null) ? 0 : getAnyVisit().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", department=").append(department);
        sb.append(", firstAndLast=").append(firstAndLast);
        sb.append(", anyVisit=").append(anyVisit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}