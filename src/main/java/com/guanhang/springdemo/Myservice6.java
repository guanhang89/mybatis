package com.guanhang.springdemo;

import com.guanhang.daoimpl.OperateTableOneImpl;

public class Myservice6 {

    private OperateTableOneImpl operateTableOne;

    private OperateTableOneImpl operateTableOne2;


    public void insert(Object o) {

        operateTableOne.insert(null);
        operateTableOne2.insert(null);
    }

    public OperateTableOneImpl getOperateTableOne2() {
        return operateTableOne2;
    }

    public void setOperateTableOne2(OperateTableOneImpl operateTableOne2) {
        this.operateTableOne2 = operateTableOne2;
    }


    public OperateTableOneImpl getOperateTableOne() {
        return operateTableOne;
    }

    public void setOperateTableOne(OperateTableOneImpl operateTableOne) {
        this.operateTableOne = operateTableOne;
    }
}
