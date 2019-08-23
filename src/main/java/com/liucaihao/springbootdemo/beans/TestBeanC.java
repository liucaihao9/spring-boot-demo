package com.liucaihao.springbootdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope(value = "prototype")
public class TestBeanC {
    @Autowired
    private TestBeanA testBeanA;

//    public TestBeanC(TestBeanA testBeanA){
//        this.testBeanA = testBeanA;
//    }
}
