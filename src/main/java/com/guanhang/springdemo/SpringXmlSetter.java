package com.guanhang.springdemo;

import com.guanhang.dao.DatabaseOperate;
//使用xml配置
public class SpringXmlSetter {

    private DatabaseOperate operate;

    public void insert(Object o) {
        operate.insert(null);
    }

    public DatabaseOperate getOperate() {
        return operate;
    }

    //xml中Setter注入
    public void setOperate(DatabaseOperate operate) {
        this.operate = operate;
    }
}
