package org.springframework.samples.annotations.internationalization;

import org.junit.Test;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ATest {
    @Test
    public void testDelegatingMessageResource() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-i18nDefault.xml");
        MessageSource source = context.getBean(MessageSource.class);
        System.out.println(source.getClass().getName());
    }
}