package com.guanhang.service;

import com.guanhang.dao.DatabaseOperate;
import com.guanhang.daoimpl.OperateTableOneImpl;
//无spring
public class Myservice {

    private DatabaseOperate operate = new OperateTableOneImpl();


    public void insert(Object one) {
        operate.insert(null);
    }

    public DatabaseOperate getOperate() {
        return operate;
    }
    public void setOperate(DatabaseOperate operate) {
        this.operate = operate;
    }


}
