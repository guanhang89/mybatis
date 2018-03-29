package com.guanhang;

import com.guanhang.dao.DatabaseOperate;
import com.guanhang.daoimpl.AOPimpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/aop.xml")
public class AOPTest {

    @Resource(name="AOPimpl")
    //这里不能用它本身的类型
    private DatabaseOperate aoPimpl;

    @Resource(name="AOPimpl2")
    private DatabaseOperate aoPimpl2;

    @Test
    public void testAOP() {
        aoPimpl.insert(null);
    }

    @Test
    public void testAOP2() {
        aoPimpl2.insert(null);
    }
}
