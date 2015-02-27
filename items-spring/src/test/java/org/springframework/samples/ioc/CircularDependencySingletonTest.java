package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.ioc.schema.injection.issue.circular.CircularDependencyASingleton;
import org.springframework.samples.ioc.schema.injection.issue.circular.CircularDependencyBSingleton;
import org.springframework.samples.testbase.TestBase;

public class CircularDependencySingletonTest extends TestBase{
    public CircularDependencySingletonTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-circular-dependency.xml");
    }

    @Test
    public void testCircularDependency() throws Exception {
        CircularDependencyASingleton a = (CircularDependencyASingleton) getBean("cda");
        CircularDependencyBSingleton b = (CircularDependencyBSingleton) getBean("cdb");
        a.invokingB();
        b.invokingA();
    }
}