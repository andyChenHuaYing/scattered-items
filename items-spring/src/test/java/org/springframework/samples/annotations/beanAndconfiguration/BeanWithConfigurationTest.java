package org.springframework.samples.annotations.beanAndconfiguration;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWithConfigurationTest {
    @Test
    public void testBeanWithConfiguration() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-BeanAndConfiguration.xml");
        A a = context.getBean(A.class);
        System.out.println(a.getClass().getName());

    }
}