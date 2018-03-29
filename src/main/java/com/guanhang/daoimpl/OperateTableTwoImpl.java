package com.guanhang.daoimpl;

import com.guanhang.dao.DatabaseOperate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class OperateTableTwoImpl implements DatabaseOperate {


    public int insert(Object o) {
        System.out.println("insert table two");
        return 0;
    }

    public int update(Object o) {
        return 0;
    }
}
