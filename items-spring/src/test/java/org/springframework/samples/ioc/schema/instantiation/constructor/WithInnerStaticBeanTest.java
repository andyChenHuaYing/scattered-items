package org.springframework.samples.ioc.schema.instantiation.constructor;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class WithInnerStaticBeanTest extends TestBase {
    public WithInnerStaticBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-constructor-instantiate-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        WithInnerStaticBean withInnerStaticBean = getBean(WithInnerStaticBean.class);
        WithInnerStaticBean.InnerBean innerBean = getBean(WithInnerStaticBean.InnerBean.class);
        System.out.println(PrintUtil.formatTestResult(withInnerStaticBean + ", " + innerBean));
    }
}