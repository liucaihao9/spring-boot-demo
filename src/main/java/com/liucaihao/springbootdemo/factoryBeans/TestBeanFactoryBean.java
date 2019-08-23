package com.liucaihao.springbootdemo.factoryBeans;

import com.liucaihao.springbootdemo.beans.TestBean;
import org.springframework.beans.factory.FactoryBean;


public class TestBeanFactoryBean implements FactoryBean<TestBean> {
    @Override
    public TestBean getObject() throws Exception {
        System.out.println("假设bean的初始化过程需要进行复杂操作，那么在通过工厂bean来创建对象时一种不错的方式");
        return new TestBean();
    }

    @Override
    public Class<TestBean> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
