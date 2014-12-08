package org.springframework.samples.testbase;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-14 18:45
 */
public class TestBase {
    private String springXmlPath;
    private ClassPathXmlApplicationContext context;

    public TestBase() {
    }

    public TestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            context = new ClassPathXmlApplicationContext("classpath*:*.xml");
            context.start();
            return;
        }
        try {
            context = new ClassPathXmlApplicationContext(springXmlPath);
        } catch (BeansException e) {
            e.printStackTrace();
            return;
        }
    }

    @After
    public void after() {
        try {
            context.destroy();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    public <T extends Object> T getBean(String beanName) {
        return (T) context.getBean(beanName);
    }

    public <T extends Object> T getBean(Class<T> clazz) {
        return (T) context.getBean(clazz);
    }

    public <T extends Object> T getBean(String beanName, Class<T> clazz) {
        return (T) context.getBean(beanName, clazz);
    }

    public Resource getResource(String location) {
        return context.getResource(location);
    }

}
