package com.fums.template_setting.pojo;

import java.util.Date;

/**
 * @author: 赵林
 * @Date: 2020/7/12 15:20
 * @Description: 基本信息表
 */
public class basicinformation {
    private Integer id;

    private String patientUnique;

    private String name;

    private String sex;

    private String bornAdress;

    private Date born;

    private String culture;

    private String phone;

    private String email;

    private String aboType;

    private String rhType;

    private Integer contactsId;

    private Integer certificatesId;

    private certificates certificates;

    private contacts contacts;

    public com.fums.template_setting.pojo.certificates getCertificates() {
        return certificates;
    }

    public void setCertificates(com.fums.template_setting.pojo.certificates certificates) {
        this.certificates = certificates;
    }

    public com.fums.template_setting.pojo.contacts getContacts() {
        return contacts;
    }

    public void setContacts(com.fums.template_setting.pojo.contacts contacts) {
        this.contacts = contacts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientUnique() {
        return patientUnique;
    }

    public void setPatientUnique(String patientUnique) {
        this.patientUnique = patientUnique == null ? null : patientUnique.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBornAdress() {
        return bornAdress;
    }

    public void setBornAdress(String bornAdress) {
        this.bornAdress = bornAdress == null ? null : bornAdress.trim();
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture == null ? null : culture.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAboType() {
        return aboType;
    }

    public void setAboType(String aboType) {
        this.aboType = aboType == null ? null : aboType.trim();
    }

    public String getRhType() {
        return rhType;
    }

    public void setRhType(String rhType) {
        this.rhType = rhType == null ? null : rhType.trim();
    }

    public Integer getContactsId() {
        return contactsId;
    }

    public void setContactsId(Integer contactsId) {
        this.contactsId = contactsId;
    }

    public Integer getCertificatesId() {
        return certificatesId;
    }

    public void setCertificatesId(Integer certificatesId) {
        this.certificatesId = certificatesId;
    }

    @Override
    public String toString() {
        return "basicinformation{" +
                "id=" + id +
                ", patientUnique='" + patientUnique + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", bornAdress='" + bornAdress + '\'' +
                ", born=" + born +
                ", culture='" + culture + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", aboType='" + aboType + '\'' +
                ", rhType='" + rhType + '\'' +
                ", contactsId=" + contactsId +
                ", certificatesId=" + certificatesId +
                ", certificates=" + certificates +
                ", contacts=" + contacts +
                '}';
    }
}
