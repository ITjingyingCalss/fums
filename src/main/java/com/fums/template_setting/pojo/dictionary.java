package com.fums.template_setting.pojo;

public class dictionary {
    private Integer id;

    private String name;

    private Integer cid;

    private Integer childrenId;

    private String children;

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
        this.name = name == null ? null : name.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getChildrenId() {
        return childrenId;
    }

    public void setChildrenId(Integer childrenId) {
        this.childrenId = childrenId;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children == null ? null : children.trim();
    }
}