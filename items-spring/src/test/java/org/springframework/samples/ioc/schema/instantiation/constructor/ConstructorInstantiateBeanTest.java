package org.springframework.samples.ioc.schema.instantiation.constructor;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class ConstructorInstantiateBeanTest extends TestBase {
    public ConstructorInstantiateBeanTest() {
        super("spring-ioc-schema-constructor-instantiate-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        ConstructorInstantiateBean bean = getBean(ConstructorInstantiateBean.class);
        System.out.println(PrintUtil.formatTestResult(bean));
    }
}