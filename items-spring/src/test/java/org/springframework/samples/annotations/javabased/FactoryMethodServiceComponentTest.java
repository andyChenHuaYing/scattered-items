package org.springframework.samples.annotations.javabased;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class FactoryMethodServiceComponentTest extends TestBase{

    public FactoryMethodServiceComponentTest() {
        super("spring-annotationJavaBase.xml");
    }

    @Test
    public void testBeanAnnotation() throws Exception {
        TestBeanAnnotation testBeanAnnotation = getBean(TestBeanAnnotation.class);
        System.out.println(testBeanAnnotation.getClass().getSimpleName());
    }
}