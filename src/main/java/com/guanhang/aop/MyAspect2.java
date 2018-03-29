package com.guanhang.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect2 {
    @Before(value="execution(public * com.guanhang.daoimpl.AOPimpl2.insert(..))")
    public void log() {
        System.out.println("start method");
    }
}
