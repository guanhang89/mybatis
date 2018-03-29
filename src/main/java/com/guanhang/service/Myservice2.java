package com.guanhang.service;

import com.guanhang.dao.DatabaseOperate;
//使用xml配置
public class Myservice2 {

    private DatabaseOperate operate;

    public void insert(Object o) {
        operate.insert(null);
    }

    public DatabaseOperate getOperate() {
        return operate;
    }

    //Setter注入
    public void setOperate(DatabaseOperate operate) {
        this.operate = operate;
    }
}
