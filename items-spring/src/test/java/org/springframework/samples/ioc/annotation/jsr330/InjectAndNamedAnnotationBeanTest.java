package org.springframework.samples.ioc.annotation.jsr330;

import org.junit.Test;
import org.springframework.samples.testbase.AnnotationTestBase;
import org.springframework.samples.utils.PrintUtil;

public class InjectAndNamedAnnotationBeanTest extends AnnotationTestBase {

    @Test
    public void testToString() throws Exception {
        InjectAndNamedAnnotationBean injectAndNamedAnnotationBean = getBean(InjectAndNamedAnnotationBean.class);
        System.out.println(PrintUtil.formatTestResult(injectAndNamedAnnotationBean));
    }
}