package org.springframework.samples.ioc.annotation.classpath.scanning.bean;

import org.junit.Test;
import org.springframework.samples.model.annotation.PlainAnnotationModelOne;
import org.springframework.samples.testbase.AnnotationTestBase;
import org.springframework.samples.utils.PrintUtil;

public class BeanCombineComponentAnnotationComplexTest extends AnnotationTestBase {

    @Test
    public void testToString() throws Exception {
        PlainAnnotationModelOne plainAnnotationModelOne = getBean("protectedPlainAnnotationModelOne",
                PlainAnnotationModelOne.class);
        System.out.println(PrintUtil.formatTestResult(plainAnnotationModelOne));
    }
}