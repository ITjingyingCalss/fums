package com.fums.template_setting.pojo;
/**
 * @author: 赵林
 * @Date: 2020/7/6 11:24
 * @Description: 模板Vo
 */
public class middle {
    private Integer id;

    private Integer patientId;

    private String did;

    private String cid;

    private Integer label;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }
}