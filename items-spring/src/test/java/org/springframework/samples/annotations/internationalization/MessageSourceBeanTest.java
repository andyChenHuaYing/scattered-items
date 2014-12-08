package org.springframework.samples.annotations.internationalization;

import org.junit.Test;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.testbase.TestMessageResourceBase;

public class MessageSourceBeanTest extends TestMessageResourceBase{

    public MessageSourceBeanTest() {
        super("spring-i18n.xml");
    }

    @Test
    public void testI18N() throws Exception {
        MessageSource messageSource = new ClassPathXmlApplicationContext("spring-i18n.xml");
        String message = messageSource.getMessage("message", null, "Default", null);
        System.out.println(message);
    }
}