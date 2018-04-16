package com.guanhang.springtest;

import com.guanhang.springdemo.SpringXmlConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/Contextforxml.xml")
public class SpringConstructXmlTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("/spring/Contextforxml.xml");

    @Test
    public void testConstructXml() {
        SpringXmlConstructor xmlConstruct = (SpringXmlConstructor) context.getBean("springXmlConstructor");
        xmlConstruct.insert(null);
    }

}
