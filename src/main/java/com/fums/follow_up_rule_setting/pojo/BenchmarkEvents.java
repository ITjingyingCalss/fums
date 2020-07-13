package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * benchmark_events
 * @author 
 */
public class BenchmarkEvents implements Serializable {
    private Integer id;

    /**
     * 门诊（0:是1:否）
     */
    private Integer outpatientDepartment;

    /**
     * 入院（0:是1:否）
     */
    private Integer beHospitalized;

    /**
     * 出院（0:是1:否）
     */
    private Integer leaveHospital;

    /**
     * 手术（0:是1:否）
     */
    private Integer operation;

    /**
     * 入ICU（0:是1:否）
     */
    private Integer admissionToIcu;

    /**
     * 出ICU（0:是1:否）
     */
    private Integer outOfIcu;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOutpatientDepartment() {
        return outpatientDepartment;
    }

    public void setOutpatientDepartment(Integer outpatientDepartment) {
        this.outpatientDepartment = outpatientDepartment;
    }

    public Integer getBeHospitalized() {
        return beHospitalized;
    }

    public void setBeHospitalized(Integer beHospitalized) {
        this.beHospitalized = beHospitalized;
    }

    public Integer getLeaveHospital() {
        return leaveHospital;
    }

    public void setLeaveHospital(Integer leaveHospital) {
        this.leaveHospital = leaveHospital;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Integer getAdmissionToIcu() {
        return admissionToIcu;
    }

    public void setAdmissionToIcu(Integer admissionToIcu) {
        this.admissionToIcu = admissionToIcu;
    }

    public Integer getOutOfIcu() {
        return outOfIcu;
    }

    public void setOutOfIcu(Integer outOfIcu) {
        this.outOfIcu = outOfIcu;
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
        BenchmarkEvents other = (BenchmarkEvents) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOutpatientDepartment() == null ? other.getOutpatientDepartment() == null : this.getOutpatientDepartment().equals(other.getOutpatientDepartment()))
            && (this.getBeHospitalized() == null ? other.getBeHospitalized() == null : this.getBeHospitalized().equals(other.getBeHospitalized()))
            && (this.getLeaveHospital() == null ? other.getLeaveHospital() == null : this.getLeaveHospital().equals(other.getLeaveHospital()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()))
            && (this.getAdmissionToIcu() == null ? other.getAdmissionToIcu() == null : this.getAdmissionToIcu().equals(other.getAdmissionToIcu()))
            && (this.getOutOfIcu() == null ? other.getOutOfIcu() == null : this.getOutOfIcu().equals(other.getOutOfIcu()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOutpatientDepartment() == null) ? 0 : getOutpatientDepartment().hashCode());
        result = prime * result + ((getBeHospitalized() == null) ? 0 : getBeHospitalized().hashCode());
        result = prime * result + ((getLeaveHospital() == null) ? 0 : getLeaveHospital().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        result = prime * result + ((getAdmissionToIcu() == null) ? 0 : getAdmissionToIcu().hashCode());
        result = prime * result + ((getOutOfIcu() == null) ? 0 : getOutOfIcu().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", outpatientDepartment=").append(outpatientDepartment);
        sb.append(", beHospitalized=").append(beHospitalized);
        sb.append(", leaveHospital=").append(leaveHospital);
        sb.append(", operation=").append(operation);
        sb.append(", admissionToIcu=").append(admissionToIcu);
        sb.append(", outOfIcu=").append(outOfIcu);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}