package org.springframework.samples.ioc.schema.lifecycle.callback;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class InitAndDestroyMethodViaXmlBeanTest extends TestBase {

    public InitAndDestroyMethodViaXmlBeanTest() {
        super("spring-ioc-schema-init-destroy-method.xml");
    }

    @Test
    public void testToString() throws Exception {
        InitAndDestroyMethodViaXmlBean initAndDestroyMethodViaXmlBean = getBean(
                "initAndDestroyMethodViaXmlBeanSingleton", InitAndDestroyMethodViaXmlBean.class);
        System.out.println(initAndDestroyMethodViaXmlBean);
        System.out.println("=========================================================================================");

        InitAndDestroyMethodViaXmlBean bean = getBean(
                "initAndDestroyMethodViaXmlBeanPrototype", InitAndDestroyMethodViaXmlBean.class);
        System.out.println(bean);
    }
}