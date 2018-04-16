package com.guanhang.springtest;

import com.guanhang.springdemo.NoSpring;
import org.junit.Test;

public class NoSpringTest {

    @Test
    public void testInsert() {
        NoSpring noSpring = new NoSpring();
        noSpring.insert(null);
    }
}