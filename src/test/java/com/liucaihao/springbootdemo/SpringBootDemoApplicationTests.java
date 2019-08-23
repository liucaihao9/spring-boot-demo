package com.liucaihao.springbootdemo;

import com.liucaihao.springbootdemo.beans.TestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests extends AbstractJUnit4SpringContextTests {
//    @Autowired
//    private TestBean testBean;
//    @Autowired
//    private TestBeanA testBeanA;


    @Test
    public void contextLoads() {
        String[] beanNames = applicationContext.getBeanNamesForType(TestBean.class);
        String[] aliases = applicationContext.getAliases(beanNames[0]);
        for (String alias : aliases) {
            System.out.println(alias);
        }
    }

}
