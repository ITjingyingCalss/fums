package com.fums.pojo;

import java.io.Serializable;

/**
 * control_tree_dictionary
 * @author 
 */
public class ControlTreeDictionary implements Serializable {
    /**
     * 字典表id
     */
    private Integer treeId;

    /**
     * 信息
     */
    private String information;

    /**
     * 主要信息
     */
    private String sonInformation;

    /**
     * 子信息
     */
    private String grandsonInformation;

    /**
     * 对应字段
     */
    private String fields;

    /**
     * 对应字段中文
     */
    private String fieldsChinaese;

    private static final long serialVersionUID = 1L;

    public Integer getTreeId() {
        return treeId;
    }

    public void setTreeId(Integer treeId) {
        this.treeId = treeId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getSonInformation() {
        return sonInformation;
    }

    public void setSonInformation(String sonInformation) {
        this.sonInformation = sonInformation;
    }

    public String getGrandsonInformation() {
        return grandsonInformation;
    }

    public void setGrandsonInformation(String grandsonInformation) {
        this.grandsonInformation = grandsonInformation;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFieldsChinaese() {
        return fieldsChinaese;
    }

    public void setFieldsChinaese(String fieldsChinaese) {
        this.fieldsChinaese = fieldsChinaese;
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
        ControlTreeDictionary other = (ControlTreeDictionary) that;
        return (this.getTreeId() == null ? other.getTreeId() == null : this.getTreeId().equals(other.getTreeId()))
            && (this.getInformation() == null ? other.getInformation() == null : this.getInformation().equals(other.getInformation()))
            && (this.getSonInformation() == null ? other.getSonInformation() == null : this.getSonInformation().equals(other.getSonInformation()))
            && (this.getGrandsonInformation() == null ? other.getGrandsonInformation() == null : this.getGrandsonInformation().equals(other.getGrandsonInformation()))
            && (this.getFields() == null ? other.getFields() == null : this.getFields().equals(other.getFields()))
            && (this.getFieldsChinaese() == null ? other.getFieldsChinaese() == null : this.getFieldsChinaese().equals(other.getFieldsChinaese()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        result = prime * result + ((getInformation() == null) ? 0 : getInformation().hashCode());
        result = prime * result + ((getSonInformation() == null) ? 0 : getSonInformation().hashCode());
        result = prime * result + ((getGrandsonInformation() == null) ? 0 : getGrandsonInformation().hashCode());
        result = prime * result + ((getFields() == null) ? 0 : getFields().hashCode());
        result = prime * result + ((getFieldsChinaese() == null) ? 0 : getFieldsChinaese().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", treeId=").append(treeId);
        sb.append(", information=").append(information);
        sb.append(", sonInformation=").append(sonInformation);
        sb.append(", grandsonInformation=").append(grandsonInformation);
        sb.append(", fields=").append(fields);
        sb.append(", fieldsChinaese=").append(fieldsChinaese);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}