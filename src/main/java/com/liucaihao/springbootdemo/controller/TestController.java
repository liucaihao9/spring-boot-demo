package com.liucaihao.springbootdemo.controller;

import com.liucaihao.springbootdemo.beans.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestBean testBean;

    @GetMapping("test")
    public void test(){
        testBean.testMethod();
    }
}
