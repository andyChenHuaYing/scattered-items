package org.springframework.samples.ioc.annotation.java.based.compose.java.based;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.model.annotation.CustomDataSourceModel;
import org.springframework.samples.testbase.AnnotationConfigApplicationContextBeanFactoryTestBase;
import org.springframework.samples.utils.PrintUtil;

public class ImportPropertiesResourceConfigTest extends AnnotationConfigApplicationContextBeanFactoryTestBase {

    @Test
    public void testImportPropertiesResourceConfig() throws Exception {
        AnnotationConfigApplicationContext context = beanFactory.simpleConstructContainer();
        context.register(ImportPropertiesResourceConfig.class);
        context.refresh();
        CustomDataSourceModel customDataSourceModel = context.getBean(CustomDataSourceModel.class);
        System.out.println(PrintUtil.formatTestResult(customDataSourceModel));
    }
}