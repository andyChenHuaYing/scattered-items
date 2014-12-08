package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class CircularDependencyTest extends TestBase{
    public CircularDependencyTest() {
        super("spring-ioc.xml");
    }

    @Test
    public void testCircularDependency() throws Exception {
        CircularDependencyA a = getBean("cda");
        CircularDependencyB b = getBean("cdb");
        a.invokingB();
        b.invokingA();
    }
}