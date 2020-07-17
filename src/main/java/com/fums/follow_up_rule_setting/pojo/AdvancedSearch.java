package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * advanced_search
 * @author 
 */
public class AdvancedSearch implements Serializable {
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 住院号
     */
    private String admissionNumber;

    /**
     * 白细胞
     */
    private Integer hemameba;

    /**
     * 血糖
     */
    private Integer bloodGlucose;

    /**
     * 症状
     */
    private String symptom;

    /**
     * 诊断
     */
    private String diagnose;

    /**
     * 手术名称
     */
    private String termOfOperation;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public Integer getHemameba() {
        return hemameba;
    }

    public void setHemameba(Integer hemameba) {
        this.hemameba = hemameba;
    }

    public Integer getBloodGlucose() {
        return bloodGlucose;
    }

    public void setBloodGlucose(Integer bloodGlucose) {
        this.bloodGlucose = bloodGlucose;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getTermOfOperation() {
        return termOfOperation;
    }

    public void setTermOfOperation(String termOfOperation) {
        this.termOfOperation = termOfOperation;
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
        AdvancedSearch other = (AdvancedSearch) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAdmissionNumber() == null ? other.getAdmissionNumber() == null : this.getAdmissionNumber().equals(other.getAdmissionNumber()))
            && (this.getHemameba() == null ? other.getHemameba() == null : this.getHemameba().equals(other.getHemameba()))
            && (this.getBloodGlucose() == null ? other.getBloodGlucose() == null : this.getBloodGlucose().equals(other.getBloodGlucose()))
            && (this.getSymptom() == null ? other.getSymptom() == null : this.getSymptom().equals(other.getSymptom()))
            && (this.getDiagnose() == null ? other.getDiagnose() == null : this.getDiagnose().equals(other.getDiagnose()))
            && (this.getTermOfOperation() == null ? other.getTermOfOperation() == null : this.getTermOfOperation().equals(other.getTermOfOperation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAdmissionNumber() == null) ? 0 : getAdmissionNumber().hashCode());
        result = prime * result + ((getHemameba() == null) ? 0 : getHemameba().hashCode());
        result = prime * result + ((getBloodGlucose() == null) ? 0 : getBloodGlucose().hashCode());
        result = prime * result + ((getSymptom() == null) ? 0 : getSymptom().hashCode());
        result = prime * result + ((getDiagnose() == null) ? 0 : getDiagnose().hashCode());
        result = prime * result + ((getTermOfOperation() == null) ? 0 : getTermOfOperation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", admissionNumber=").append(admissionNumber);
        sb.append(", hemameba=").append(hemameba);
        sb.append(", bloodGlucose=").append(bloodGlucose);
        sb.append(", symptom=").append(symptom);
        sb.append(", diagnose=").append(diagnose);
        sb.append(", termOfOperation=").append(termOfOperation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}