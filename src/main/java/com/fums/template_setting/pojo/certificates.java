package com.fums.template_setting.pojo;

/**
 * @author: 赵林
 * @Date: 2020/7/12 15:52
 * @Description: 证件表
 */
public class certificates {
    private Integer id;

    private String idcard;

    private String accountBookNo;

    private String passportNo;

    private String officerNumber;

    private String driverNumber;

    private String hongKongAndMacaoPassNo;

    private String taiwanPassNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getAccountBookNo() {
        return accountBookNo;
    }

    public void setAccountBookNo(String accountBookNo) {
        this.accountBookNo = accountBookNo == null ? null : accountBookNo.trim();
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo == null ? null : passportNo.trim();
    }

    public String getOfficerNumber() {
        return officerNumber;
    }

    public void setOfficerNumber(String officerNumber) {
        this.officerNumber = officerNumber == null ? null : officerNumber.trim();
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber == null ? null : driverNumber.trim();
    }

    public String getHongKongAndMacaoPassNo() {
        return hongKongAndMacaoPassNo;
    }

    public void setHongKongAndMacaoPassNo(String hongKongAndMacaoPassNo) {
        this.hongKongAndMacaoPassNo = hongKongAndMacaoPassNo == null ? null : hongKongAndMacaoPassNo.trim();
    }

    public String getTaiwanPassNumber() {
        return taiwanPassNumber;
    }

    public void setTaiwanPassNumber(String taiwanPassNumber) {
        this.taiwanPassNumber = taiwanPassNumber == null ? null : taiwanPassNumber.trim();
    }

    @Override
    public String toString() {
        return "certificates{" +
                "id=" + id +
                ", idcard='" + idcard + '\'' +
                ", accountBookNo='" + accountBookNo + '\'' +
                ", passportNo='" + passportNo + '\'' +
                ", officerNumber='" + officerNumber + '\'' +
                ", driverNumber='" + driverNumber + '\'' +
                ", hongKongAndMacaoPassNo='" + hongKongAndMacaoPassNo + '\'' +
                ", taiwanPassNumber='" + taiwanPassNumber + '\'' +
                '}';
    }
}
