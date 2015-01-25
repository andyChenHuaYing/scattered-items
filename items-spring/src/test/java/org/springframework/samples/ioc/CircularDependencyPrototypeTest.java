package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.ioc.schema.injection.circular.CircularDependencyAPrototype;
import org.springframework.samples.ioc.schema.injection.circular.CircularDependencyBPrototype;
import org.springframework.samples.testbase.TestBase;

public class CircularDependencyPrototypeTest extends TestBase {
    public CircularDependencyPrototypeTest() {
        super("spring-ioc-circular-dependency.xml");
    }

    @Test
    public void testCircularDependency() throws Exception {
        CircularDependencyAPrototype a = (CircularDependencyAPrototype) getBean("cdaPrototype");
        CircularDependencyBPrototype b = (CircularDependencyBPrototype) getBean("cdbPrototype");
        a.invokingB();
        b.invokingA();
    }
}