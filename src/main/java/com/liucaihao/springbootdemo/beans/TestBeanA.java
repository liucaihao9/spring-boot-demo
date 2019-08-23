package com.liucaihao.springbootdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope(value = "prototype")
public class TestBeanA {
    @Autowired
    private TestBeanB testBeanB;

    public void testMethod(){
        System.out.println("testMethodA");
    }

//    public TestBeanA(TestBeanB testBeanB){
//        this.testBeanB = testBeanB;
//    }
}
