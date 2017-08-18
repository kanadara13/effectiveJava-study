package com.effective.study.rule1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaticFactoryTest {


    @Test
    public void test(){
        StaticFactory factory = new StaticFactory();
        assertNotNull(factory);
    }
}