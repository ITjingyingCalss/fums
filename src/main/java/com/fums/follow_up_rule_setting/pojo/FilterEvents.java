package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * filter_events
 * @author 
 */
public class FilterEvents implements Serializable {
    private Integer id;

    /**
     * 本院(0:是1:否)
     */
    private Integer ourHospital;

    /**
     * 本科室(0:是1:否)
     */
    private Integer undergraduateDepartment;

    /**
     * 首次(0:是1:否)
     */
    private Integer first;

    /**
     * 末次(0:是1:否)
     */
    private Integer last;

    /**
     * 本就诊(0:是1:否)
     */
    private Integer thisVisit;

    /**
     * 任意就诊(0:是1:否)
     */
    private Integer arbitraryTreatment;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOurHospital() {
        return ourHospital;
    }

    public void setOurHospital(Integer ourHospital) {
        this.ourHospital = ourHospital;
    }

    public Integer getUndergraduateDepartment() {
        return undergraduateDepartment;
    }

    public void setUndergraduateDepartment(Integer undergraduateDepartment) {
        this.undergraduateDepartment = undergraduateDepartment;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public Integer getThisVisit() {
        return thisVisit;
    }

    public void setThisVisit(Integer thisVisit) {
        this.thisVisit = thisVisit;
    }

    public Integer getArbitraryTreatment() {
        return arbitraryTreatment;
    }

    public void setArbitraryTreatment(Integer arbitraryTreatment) {
        this.arbitraryTreatment = arbitraryTreatment;
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
            && (this.getOurHospital() == null ? other.getOurHospital() == null : this.getOurHospital().equals(other.getOurHospital()))
            && (this.getUndergraduateDepartment() == null ? other.getUndergraduateDepartment() == null : this.getUndergraduateDepartment().equals(other.getUndergraduateDepartment()))
            && (this.getFirst() == null ? other.getFirst() == null : this.getFirst().equals(other.getFirst()))
            && (this.getLast() == null ? other.getLast() == null : this.getLast().equals(other.getLast()))
            && (this.getThisVisit() == null ? other.getThisVisit() == null : this.getThisVisit().equals(other.getThisVisit()))
            && (this.getArbitraryTreatment() == null ? other.getArbitraryTreatment() == null : this.getArbitraryTreatment().equals(other.getArbitraryTreatment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOurHospital() == null) ? 0 : getOurHospital().hashCode());
        result = prime * result + ((getUndergraduateDepartment() == null) ? 0 : getUndergraduateDepartment().hashCode());
        result = prime * result + ((getFirst() == null) ? 0 : getFirst().hashCode());
        result = prime * result + ((getLast() == null) ? 0 : getLast().hashCode());
        result = prime * result + ((getThisVisit() == null) ? 0 : getThisVisit().hashCode());
        result = prime * result + ((getArbitraryTreatment() == null) ? 0 : getArbitraryTreatment().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ourHospital=").append(ourHospital);
        sb.append(", undergraduateDepartment=").append(undergraduateDepartment);
        sb.append(", first=").append(first);
        sb.append(", last=").append(last);
        sb.append(", thisVisit=").append(thisVisit);
        sb.append(", arbitraryTreatment=").append(arbitraryTreatment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}