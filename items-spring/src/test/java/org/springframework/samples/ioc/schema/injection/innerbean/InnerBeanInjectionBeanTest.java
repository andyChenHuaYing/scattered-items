package org.springframework.samples.ioc.schema.injection.innerbean;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class InnerBeanInjectionBeanTest extends TestBase {
    public InnerBeanInjectionBeanTest() {
        super("spring-ioc-schema-inner-bean-injection.xml");
    }

    @Test
    public void testToString() throws Exception {
        InnerBeanInjectionBean innerBeanInjectionBean = getBean("innerBeanInjectionBean", InnerBeanInjectionBean.class);
        System.out.println(PrintUtil.formatTestResult(innerBeanInjectionBean));
    }
}