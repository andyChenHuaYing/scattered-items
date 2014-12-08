package org.springframework.samples.annotations.jsr330annotation;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class BeanAndConfigurationAnnotationBeanPortalTest extends TestBase{
    public BeanAndConfigurationAnnotationBeanPortalTest() {
        super("spring-annotationJavaBase.xml");
    }

    @Test
    public void testInjectAnnotation() throws Exception {
        BeanPortal portal = super.getBean("beanPortal");
        portal.showReference();
    }

    @Test
    public void testNamed() throws Exception {
//        TestBeanTwo testBeanTwo = super.getBean(TestBeanTwo.class);
        TestBeanTwo testBeanTwo = super.getBean("bean2");
        System.out.println(testBeanTwo.getClass().getSimpleName());

    }
}