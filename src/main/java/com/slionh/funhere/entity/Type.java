package com.slionh.funhere.entity;

public class Type {
    private Integer typeid;

    private String name;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeid=" + typeid +
                ", name='" + name + '\'' +
                '}';
    }
}