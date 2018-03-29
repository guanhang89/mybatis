package com.guanhang;

import com.guanhang.bean.StudentExample;
import com.guanhang.dao.MybatisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/mybatisspring.xml")
public class MybatisTest {

    @Autowired
    private MybatisDao mybatisDao;

    @Test
    public void test() {
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andNameEqualTo("xiaowang");
        mybatisDao.quey(studentExample);

    }
}
