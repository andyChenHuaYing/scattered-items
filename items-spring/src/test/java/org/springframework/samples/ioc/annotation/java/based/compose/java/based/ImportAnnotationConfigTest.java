package org.springframework.samples.ioc.annotation.java.based.compose.java.based;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.model.PlainModelSix;
import org.springframework.samples.testbase.AnnotationConfigApplicationContextBeanFactoryTestBase;
import org.springframework.samples.utils.PrintUtil;

public class ImportAnnotationConfigTest extends AnnotationConfigApplicationContextBeanFactoryTestBase {

    @Test
    public void testImportAnnotation() throws Exception {
        AnnotationConfigApplicationContext context = beanFactory.simpleConstructContainer();
        context.register(ImportAnnotationConfig.class);
        context.refresh();
        PlainModelSix plainModelSix = context.getBean(PlainModelSix.class);
        System.out.println(PrintUtil.formatTestResult(plainModelSix));
    }
}