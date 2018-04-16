package com.guanhang.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect2 {
    @Before(value="execution(public * com.guanhang.aop.impl.AOPimpl2.insert(..))")
    public void log() {
        System.out.println("start method");
    }
}
