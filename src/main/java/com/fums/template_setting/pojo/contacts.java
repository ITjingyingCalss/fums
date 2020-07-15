package com.fums.template_setting.pojo;

/**
 * @author: 赵林
 * @Date: 2020/7/12 15:52
 * @Description: 联系人表
 */
public class contacts {
    private Integer id;

    private String relationship;

    private String relationshipName;

    private String relationshipSex;

    private String relationshipAdress;

    private String relationshipEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName == null ? null : relationshipName.trim();
    }

    public String getRelationshipSex() {
        return relationshipSex;
    }

    public void setRelationshipSex(String relationshipSex) {
        this.relationshipSex = relationshipSex == null ? null : relationshipSex.trim();
    }

    public String getRelationshipAdress() {
        return relationshipAdress;
    }

    public void setRelationshipAdress(String relationshipAdress) {
        this.relationshipAdress = relationshipAdress == null ? null : relationshipAdress.trim();
    }

    public String getRelationshipEmail() {
        return relationshipEmail;
    }

    public void setRelationshipEmail(String relationshipEmail) {
        this.relationshipEmail = relationshipEmail == null ? null : relationshipEmail.trim();
    }

    @Override
    public String toString() {
        return "contacts{" +
                "id=" + id +
                ", relationship='" + relationship + '\'' +
                ", relationshipName='" + relationshipName + '\'' +
                ", relationshipSex='" + relationshipSex + '\'' +
                ", relationshipAdress='" + relationshipAdress + '\'' +
                ", relationshipEmail='" + relationshipEmail + '\'' +
                '}';
    }
}
