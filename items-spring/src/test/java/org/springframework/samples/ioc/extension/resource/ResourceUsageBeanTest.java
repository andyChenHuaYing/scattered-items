package org.springframework.samples.ioc.extension.resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.utils.PrintUtil;

import java.util.Locale;

public class ResourceUsageBeanTest {
    private ResourceUsageBean resourceUsageBean;
    private ClassPathXmlApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("spring_configuration/ioc/extension/spring-ioc-extension-resource.xml");
        context.start();
        resourceUsageBean = context.getBean(ResourceUsageBean.class);
    }

    @After
    public void tearDown() {
        context.destroy();
    }

    @Test
    public void testGetMessage() throws Exception {

        String messageOne = resourceUsageBean.getMessage("message", null, null);
        String messageTwo = resourceUsageBean.getMessage("placeholderMessage",
                new Object[]{"ParameterOne", "ParameterTwo"}, Locale.UK);
        System.out.println(PrintUtil.formatTestResult(messageOne, messageTwo));
    }

    @Test
    public void testGetMessageWithDefault() throws Exception {
        String messageOne = resourceUsageBean.getMessage("messageOne", null, "messageOne is not exist!", null);
        String messageTwo = resourceUsageBean.getMessage("placeholderMessage",
                new Object[]{"ParameterOne", "ParameterTwo"}, Locale.UK);
        System.out.println(PrintUtil.formatTestResult(messageOne, messageTwo));
    }
}