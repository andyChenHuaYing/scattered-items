package org.springframework.samples.testbase;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.util.Locale;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-25 19:19
 */
public class TestMessageResourceBase {
    private Resource resource;
    private MessageSource messageSource;
    private String xmlPath;

    public TestMessageResourceBase() { }

    public TestMessageResourceBase(String xmlPath) {
        this.xmlPath = xmlPath;
    }

    @Before
    public void before() {
        messageSource = new ClassPathXmlApplicationContext(xmlPath);
    }

    @After
    public void after() {
        messageSource = null;
        System.gc();
    }

    public String getMessage(String code, Object[] args, String defaultValue, Locale loc) {
        return messageSource.getMessage(code, args, defaultValue, loc);
    }

    public String getMessage(String code, Object[] args, Locale loc) {
        return messageSource.getMessage(code, args, loc);
    }

    public String getMessage(MessageSourceResolvable resolvable, Locale loc) {
        return messageSource.getMessage(resolvable, loc);
    }

    public ApplicationContext getContext() {
        return (ApplicationContext)messageSource;
    }
}
