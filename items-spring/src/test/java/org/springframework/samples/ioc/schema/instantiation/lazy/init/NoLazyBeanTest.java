package org.springframework.samples.ioc.schema.instantiation.lazy.init;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class NoLazyBeanTest extends TestBase {
    public NoLazyBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-lazy-init.xml");
    }

    @Test
    public void testToString() throws Exception {
    }
}