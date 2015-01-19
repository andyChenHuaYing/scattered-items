package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.ioc.circular.dependency.CircularDependencyASingleton;
import org.springframework.samples.ioc.circular.dependency.CircularDependencyBSingleton;
import org.springframework.samples.testbase.TestBase;

public class CircularDependencySingletonTest extends TestBase{
    public CircularDependencySingletonTest() {
        super("spring-ioc-circular-dependency.xml");
    }

    @Test
    public void testCircularDependency() throws Exception {
        CircularDependencyASingleton a = getBean("cda");
        CircularDependencyBSingleton b = getBean("cdb");
        a.invokingB();
        b.invokingA();
    }
}