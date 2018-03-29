package com.guanhang.daoimpl;

public class OperateTableFactory {

    //非静态
    public OperateTableOneImpl createInstance() {
        return new OperateTableOneImpl();
    }
}
