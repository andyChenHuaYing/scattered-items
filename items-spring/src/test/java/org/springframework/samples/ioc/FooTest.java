package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class FooTest extends TestBase{
    public FooTest() {
        super("spring-ioc.xml");
    }

    @Test
    public void testToString() throws Exception {
        Foo foo = getBean(Foo.class);
        foo.toString();
    }

    @Test
    public void testIterateMap() throws Exception {
        Foo foo = getBean(Foo.class);
        foo.iterateMap();
    }
}