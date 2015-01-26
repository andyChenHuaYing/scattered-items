package org.springframework.samples.ioc.schema.injection.depends.on;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class DependsOnSingleBeanTest extends TestBase {

    public DependsOnSingleBeanTest() {
        super("spring-ioc-schema-depend-on-bean-injection.xml");
    }

    @Test
    public void testDependsOn() {
    }
}