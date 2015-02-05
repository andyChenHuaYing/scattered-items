package org.springframework.samples.ioc.annotation.jsr330;

import org.junit.Test;
import org.springframework.samples.testbase.AnnotationTestBase;
import org.springframework.samples.utils.PrintUtil;

public class InjectionAnnotationTest extends AnnotationTestBase {

    @Test
    public void testToString() throws Exception {
        InjectAnnotationBean injectionAnnotation = getBean(InjectAnnotationBean.class);
        System.out.println(PrintUtil.formatTestResult(injectionAnnotation));
    }
}