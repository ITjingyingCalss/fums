package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * any_visit
 * @author 
 */
public class AnyVisit implements Serializable {
    private Integer anyVisitId;

    private String anyVisitName;

    private static final long serialVersionUID = 1L;

    public Integer getAnyVisitId() {
        return anyVisitId;
    }

    public void setAnyVisitId(Integer anyVisitId) {
        this.anyVisitId = anyVisitId;
    }

    public String getAnyVisitName() {
        return anyVisitName;
    }

    public void setAnyVisitName(String anyVisitName) {
        this.anyVisitName = anyVisitName;
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
        AnyVisit other = (AnyVisit) that;
        return (this.getAnyVisitId() == null ? other.getAnyVisitId() == null : this.getAnyVisitId().equals(other.getAnyVisitId()))
            && (this.getAnyVisitName() == null ? other.getAnyVisitName() == null : this.getAnyVisitName().equals(other.getAnyVisitName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnyVisitId() == null) ? 0 : getAnyVisitId().hashCode());
        result = prime * result + ((getAnyVisitName() == null) ? 0 : getAnyVisitName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", anyVisitId=").append(anyVisitId);
        sb.append(", anyVisitName=").append(anyVisitName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}