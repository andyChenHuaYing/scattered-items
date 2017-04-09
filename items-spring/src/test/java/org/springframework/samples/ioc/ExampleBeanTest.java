package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class ExampleBeanTest extends TestBase {
    public ExampleBeanTest() {
        super("spring-ioc.xml");
    }

    @Test
    public void testConclusion() throws Exception {
        ExampleBean exampleBean = getBean(ExampleBean.class);
        exampleBean.conclusion();
        exampleBean.emailAndGmail();
    }
}