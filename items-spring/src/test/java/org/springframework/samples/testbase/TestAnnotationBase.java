package org.springframework.samples.testbase;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-24 20:12
 */
public class TestAnnotationBase {
    AnnotationConfigApplicationContext context;
    private Class[] classes;

    public TestAnnotationBase(Class ... classes) {
        this.classes = classes;
    }


    @Before
    public void before() {
        context = new AnnotationConfigApplicationContext();
        context.register(classes);
        context.refresh();
    }

    @After
    public void after() {
        context.close();
    }

    public <T extends Object> T getBean(String beanName) {
        return (T)context.getBean(beanName);
    }

    public <T extends Object> T getBean(Class<T> tClass) {
        return (T) context.getBean(tClass);
    }

    public <T extends Object> T getBean(String name, Class<T> tClass) {
        return (T) context.getBean(name, tClass);
    }
}
