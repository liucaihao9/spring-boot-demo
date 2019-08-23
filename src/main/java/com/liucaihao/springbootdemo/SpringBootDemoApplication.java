package com.liucaihao.springbootdemo;

import com.liucaihao.springbootdemo.beans.TestBean;
import com.liucaihao.springbootdemo.factoryBeans.TestBeanFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }


    @Bean
    public TestBeanFactoryBean getTestBeanFactoryBean(){
        return new TestBeanFactoryBean();
    }

//    @Bean(value = {"testBean1" , "testBean2"})
//    public TestBean getTestBean(){
//        return new TestBean();
//    }

    @Bean(value = {"testBean" , "testBean1"})
    @Autowired
    public TestBean getTestBean(TestBeanFactoryBean testBeanFactoryBean) throws Exception {
        return testBeanFactoryBean.getObject();
    }
}
