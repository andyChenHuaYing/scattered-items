package org.springframework.samples.ioc.annotation.java.based.configuration;

import org.junit.Test;
import org.springframework.samples.model.PlainModelSix;
import org.springframework.samples.testbase.AnnotationTestBase;
import org.springframework.samples.utils.PrintUtil;

public class InjectInterBeanDependencyTest extends AnnotationTestBase {

    @Test
    public void testInjectInterBeanDependency() throws Exception {
        PlainModelSix plainModelSix = getBean(PlainModelSix.class);
        System.out.println(PrintUtil.formatTestResult(plainModelSix));
    }
}