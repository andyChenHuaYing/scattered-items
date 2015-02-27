package org.springframework.samples.ioc.annotation.java.based.configuration;

import org.junit.Test;
import org.springframework.samples.testbase.AnnotationTestBase;
import org.springframework.samples.utils.PrintUtil;

public class ConfigurationAnnotationConfigTest extends AnnotationTestBase {

    @Test
    public void testSingletonWithPrototype() throws Exception {
        SingletonBeanAbstract singletonBeanAbstract = getBean(SingletonBeanAbstract.class);
        System.out.println(PrintUtil.formatTestResult(singletonBeanAbstract));
    }
}