package org.springframework.samples.ioc.annotation.environment.property.source;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.model.annotation.CustomDataSourceModel;
import org.springframework.samples.testbase.AnnotationConfigApplicationContextBeanFactoryTestBase;
import org.springframework.samples.utils.PrintUtil;

public class PropertySourceBeanTest extends AnnotationConfigApplicationContextBeanFactoryTestBase {

    @Test
    public void testPropertySource() throws Exception {
        AnnotationConfigApplicationContext context = beanFactory.simpleConstructContainer();
        context.register(PropertySourceBean.class);
        context.refresh();
        CustomDataSourceModel customDataSourceModel = context.getBean(CustomDataSourceModel.class);
        System.out.println(PrintUtil.formatTestResult(customDataSourceModel));
    }
}