package org.springframework.samples.ioc.schema.instantiation.factory;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class InstantiateBeanStaticFactoryTest extends TestBase {
    public InstantiateBeanStaticFactoryTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-factory-instantiation-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        InstantiateBeanStaticFactory instantiateBeanStaticFactory =
                getBean("instantiateBeanStaticFactory", InstantiateBeanStaticFactory.class);
        System.out.println(PrintUtil.formatTestResult(instantiateBeanStaticFactory));
    }
}