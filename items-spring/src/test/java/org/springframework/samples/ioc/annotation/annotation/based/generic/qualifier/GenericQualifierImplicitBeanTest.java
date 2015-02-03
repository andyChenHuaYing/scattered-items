package org.springframework.samples.ioc.annotation.annotation.based.generic.qualifier;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class GenericQualifierImplicitBeanTest extends TestBase {

    public GenericQualifierImplicitBeanTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-qualifier-generic-implicit.xml");
    }

    @Test
    public void testToString() throws Exception {
        GenericQualifierImplicitBean bean = getBean(GenericQualifierImplicitBean.class);
        System.out.println(PrintUtil.formatTestResult(bean));
    }
}