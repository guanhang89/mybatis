package com.guanhang;

import com.guanhang.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/Context*.xml")
public class SpringTest
{

    @Test
    public void testNoSpring() {
        Myservice myservice = new Myservice();
        myservice.insert(null);
    }

    @Test
    public void testwithSpringXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/Contextforxml.xml");
        Myservice2 myservice2 =(Myservice2)context.getBean("myservice2");
        myservice2.insert(null);

    }

    @Test
    public void testwithSpringANNO() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/Contextforanno.xml");
        Myservice3 myservice3 = (Myservice3)context.getBean("AnnoService");
        myservice3.insert(null);

    }

    @Test
    public void testwithSpringConstructAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/Contextforanno.xml");
        Myservice4 myservice4 = (Myservice4)context.getBean("myservice4");
        myservice4.insert(null);

    }

    @Test
    public void testwithSpringConstructXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/Contextforxml.xml","/spring/Contextforanno.xml");
        Myservice5 myservice5 = (Myservice5)context.getBean("myservice5");
        myservice5.insert(null);

    }


    @Test
    public void testFactory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/Contextforanno.xml","/spring/Contextforxml.xml");
        Myservice6 myservice6 = (Myservice6)context.getBean("myservice6");
        myservice6.insert(null);
    }

}
