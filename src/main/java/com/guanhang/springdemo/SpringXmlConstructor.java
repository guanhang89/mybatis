package com.guanhang.springdemo;

import com.guanhang.daoimpl.OperateTableTwoImpl;

/**
 * 采用构造方法注入
 */
public class SpringXmlConstructor {

    private OperateTableTwoImpl operateTableTwo;

    public SpringXmlConstructor(OperateTableTwoImpl operateTableTwo) {
        this.operateTableTwo = operateTableTwo;
    }

    public void insert(Object o) {
        operateTableTwo.insert(null);
    }
}
