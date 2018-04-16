package com.guanhang.springtest;

import com.guanhang.springdemo.SpringXmlSetter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//不加下面这个会出错
@ContextConfiguration("/spring/Contextforxml.xml")
public class SpringSetterXmlTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("/spring/Contextforxml.xml");

    @Test
    public void testSetterMethos() {
        SpringXmlSetter springSetter = (SpringXmlSetter) context.getBean("springSetter");
        springSetter.insert(null);

    }
}
