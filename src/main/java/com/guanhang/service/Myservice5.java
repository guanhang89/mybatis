package com.guanhang.service;

import com.guanhang.daoimpl.OperateTableTwoImpl;

public class Myservice5 {

    private OperateTableTwoImpl operateTableTwo;

    public Myservice5(OperateTableTwoImpl operateTableTwo) {
        this.operateTableTwo = operateTableTwo;
    }

    public void insert(Object o) {
        operateTableTwo.insert(null);
    }
}
