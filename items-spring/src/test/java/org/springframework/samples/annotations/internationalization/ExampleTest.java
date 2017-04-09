package org.springframework.samples.annotations.internationalization;

import org.junit.Test;
import org.springframework.samples.testbase.TestMessageResourceBase;

public class ExampleTest extends TestMessageResourceBase {
    public ExampleTest() {
        super("spring-i18n.xml");
    }

    @Test
    public void testMessageSource() throws Exception {
        Example example = getContext().getBean(Example.class);
        example.execute();
    }
}