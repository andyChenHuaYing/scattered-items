package org.springframework.samples.resources;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BarTest {
    @Test
    public void testClassPathXmlApplicationContextInstances() throws Exception {
        ApplicationContext context;
        Bar bar;
        //context = new ClassPathXmlApplicationContext("spring-resourcesShortcuts.xml");
        //context = new ClassPathXmlApplicationContext("file:E:\\IdeaProjects\\scattered=items\\items-spring\\src\\main\\java\\org\\springframework\\samples\\resources\\spring-resourcesShortcuts.xml");
        context = new ClassPathXmlApplicationContext("spring-resourcesShortcuts.xml", Bar.class);
        bar = context.getBean(Bar.class);
    }
}