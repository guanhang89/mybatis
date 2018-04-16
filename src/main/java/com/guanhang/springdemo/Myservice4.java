package com.guanhang.springdemo;

import com.guanhang.daoimpl.OperateTableTwoImpl;
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
