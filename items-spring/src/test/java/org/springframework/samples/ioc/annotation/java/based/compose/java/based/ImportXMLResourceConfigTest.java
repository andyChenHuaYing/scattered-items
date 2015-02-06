package org.springframework.samples.ioc.annotation.java.based.compose.java.based;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.testbase.AnnotationConfigApplicationContextBeanFactoryTestBase;
import org.springframework.samples.utils.PrintUtil;

public class ImportXMLResourceConfigTest extends AnnotationConfigApplicationContextBeanFactoryTestBase {

    @Test
    public void testImportXMLResourceConfig() throws Exception {
        AnnotationConfigApplicationContext context = beanFactory.simpleConstructContainer();
        context.register(ImportXMLResourceConfig.class);
        context.refresh();
        PlainModelOne plainModelOne = (PlainModelOne) context.getBean("plainModelOnlyOneSingleton");
        System.out.println(PrintUtil.formatTestResult(plainModelOne));
    }
}