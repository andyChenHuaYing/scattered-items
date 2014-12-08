package org.springframework.samples.annotations.internationalization;

import org.junit.Test;
import org.springframework.samples.testbase.TestMessageResourceBase;

public class I18NExampleTest extends TestMessageResourceBase{
    public I18NExampleTest() {
        super("spring-i18n.xml");
    }

    @Test
    public void testI18NMessageResource() throws Exception {
        I18NExample example = getContext().getBean(I18NExample.class);
        example.execute();

    }
}