package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class DependsOnSomeBeanTest extends TestBase {
    public DependsOnSomeBeanTest() {
        super("spring-ioc.xml");
    }

    @Test
    public void testDependsOn() throws Exception {

    }
}