package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * first_and_last
 * @author 
 */
public class FirstAndLast implements Serializable {
    private Integer firstAndLastId;

    private String firstAndLastName;

    private static final long serialVersionUID = 1L;

    public Integer getFirstAndLastId() {
        return firstAndLastId;
    }

    public void setFirstAndLastId(Integer firstAndLastId) {
        this.firstAndLastId = firstAndLastId;
    }

    public String getFirstAndLastName() {
        return firstAndLastName;
    }

    public void setFirstAndLastName(String firstAndLastName) {
        this.firstAndLastName = firstAndLastName;
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
        FirstAndLast other = (FirstAndLast) that;
        return (this.getFirstAndLastId() == null ? other.getFirstAndLastId() == null : this.getFirstAndLastId().equals(other.getFirstAndLastId()))
            && (this.getFirstAndLastName() == null ? other.getFirstAndLastName() == null : this.getFirstAndLastName().equals(other.getFirstAndLastName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFirstAndLastId() == null) ? 0 : getFirstAndLastId().hashCode());
        result = prime * result + ((getFirstAndLastName() == null) ? 0 : getFirstAndLastName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", firstAndLastId=").append(firstAndLastId);
        sb.append(", firstAndLastName=").append(firstAndLastName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}