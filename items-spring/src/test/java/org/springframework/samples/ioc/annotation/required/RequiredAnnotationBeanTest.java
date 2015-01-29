package org.springframework.samples.ioc.annotation.required;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class RequiredAnnotationBeanTest extends TestBase {

    public RequiredAnnotationBeanTest() {
        super("spring-annotation-required.xml");
    }

    @Test

    public void testToString() throws Exception {
        RequiredAnnotationBean requiredAnnotationBean = getBean(RequiredAnnotationBean.class);
        System.out.println(PrintUtil.formatTestResult(requiredAnnotationBean));

    }
}