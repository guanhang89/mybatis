package com.guanhang.daoimpl;

import com.guanhang.dao.DatabaseOperate;

public class OperateTableOneImpl implements DatabaseOperate {
    public int insert(Object o) {
        System.out.println("insert table one");
        return 0;
    }

    public int update(Object o) {
        System.out.println("update table two");
        return 0;
    }
}
