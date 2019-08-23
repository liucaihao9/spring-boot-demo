package com.liucaihao.springbootdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope(value = "prototype")
public class TestBeanB {
    @Autowired
    private TestBeanC testBeanC;

//    public TestBeanB(TestBeanC testBeanC){
//        this.testBeanC = testBeanC;
//    }

}
