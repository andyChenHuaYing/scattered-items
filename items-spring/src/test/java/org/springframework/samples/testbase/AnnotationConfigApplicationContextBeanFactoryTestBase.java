package org.springframework.samples.testbase;

import org.junit.Before;
import org.springframework.samples.ioc.annotation.java.based.instantiate.container.AnnotationConfigApplicationContextBeanFactory;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
public class AnnotationConfigApplicationContextBeanFactoryTestBase {
    protected AnnotationConfigApplicationContextBeanFactory beanFactory;

    @Before
    public void setUp() throws Exception {
        beanFactory = new AnnotationConfigApplicationContextBeanFactory();
    }
}
