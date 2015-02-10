package org.springframework.samples.resources;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.model.InnerBeanModel;
import org.springframework.samples.model.IntegerGenericPlainModelOne;
import org.springframework.samples.utils.PrintUtil;

public class ClasspathWildcardBeanTest {
    private ClassPathXmlApplicationContext context;

    @Before
    public void before() {
        context = new ClasspathWildcardBean("classpath*:spring_configuration/public/spring-*.xml").getContext();
//        context = new ClasspathWildcardBean("classpath:spring_configuration/public/spring-*.xml").getContext();
        context.start();
    }

    @Test
    public void testToString() throws Exception {
        IntegerGenericPlainModelOne one = (IntegerGenericPlainModelOne) context.getBean("integerGenericPlainModelOne");
        InnerBeanModel model = context.getBean("innerBeanModelPrototype", InnerBeanModel.class);
        System.out.println(PrintUtil.formatTestResult(one, model));
    }
}