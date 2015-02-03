package org.springframework.samples.ioc.schema.lifecycle.callback;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class InitAndDestroyViaSpringBeanTest extends TestBase {
    public InitAndDestroyViaSpringBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-init-destroy-method.xml");
    }

    @Test
    public void testInitializingBeanAdnDisposableBean() throws Exception {
    }
}