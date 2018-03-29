package com.guanhang.service;

import com.guanhang.daoimpl.OperateTableTwoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Myservice4 {

    private OperateTableTwoImpl operateTableTwo;

//    @Autowired
    public Myservice4(OperateTableTwoImpl operateTableTwo) {
        this.operateTableTwo = operateTableTwo;
    }

    public void insert(Object o) {
        operateTableTwo.insert(null);
    }
}
