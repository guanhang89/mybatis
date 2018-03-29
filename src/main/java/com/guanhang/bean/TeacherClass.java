package com.guanhang.bean;

public class TeacherClass extends TeacherClassKey {
    private String cid;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }
}