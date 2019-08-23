package com.liucaihao.springbootdemo.beanPostProcessors;

import com.liucaihao.springbootdemo.beans.TestBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 在初始化对象前后会执行相应的回调方法
 */
@Component
public class TestInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.startsWith("test")){
            System.out.println(1);
        }
        if (beanClass == TestBean.class){
            System.out.println(beanClass.getName() + "->" + beanName);
            try {
                Object o = beanClass.newInstance();
                System.out.println(o);
                return o;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }
}
