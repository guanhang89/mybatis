package com.guanhang.springdemo;

import com.guanhang.dao.DatabaseOperate;
import com.guanhang.daoimpl.OperateTableOneImpl;

/**
 * 无spring的使用场景
 */
public class NoSpring {

    //操作数据库一
    private DatabaseOperate operate = new OperateTableOneImpl();

    //会打印相关的语句
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
