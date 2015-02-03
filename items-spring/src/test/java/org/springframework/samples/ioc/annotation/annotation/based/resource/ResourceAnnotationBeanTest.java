package org.springframework.samples.ioc.annotation.annotation.based.resource;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class ResourceAnnotationBeanTest extends TestBase {
    public ResourceAnnotationBeanTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-jsr-250-resource.xml");
    }

    @Test
    public void testToString() throws Exception {
        ResourceAnnotationBean bean = getBean(ResourceAnnotationBean.class);
        System.out.println(PrintUtil.formatTestResult(bean));
    }
}