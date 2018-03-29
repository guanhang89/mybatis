package com.guanhang.aop;

import org.springframework.stereotype.Component;

@Component
public class MyAspect {
    public void log() {
        System.out.println("start method");
    }
}
