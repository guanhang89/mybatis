package com.guanhang.aop.aspect;

import org.springframework.stereotype.Component;

@Component
public class MyAspect {
    public void log() {
        System.out.println("start method");
    }
}
