package org.springframework.samples.ioc.annotation.java.based.instantiate.container;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.model.annotation.ComponentAnnotationModel;
import org.springframework.samples.model.annotation.ServiceAnnotationModel;
import org.springframework.samples.testbase.AnnotationConfigApplicationContextBeanFactoryTestBase;
import org.springframework.samples.utils.PrintUtil;

public class AnnotationConfigApplicationContextBeanFactoryTest extends AnnotationConfigApplicationContextBeanFactoryTestBase {

    @Test
    public void testSimpleConstructContainer() throws Exception {
        AnnotationConfigApplicationContext configApplicationContext = beanFactory.simpleConstructContainer();
        configApplicationContext.register(ComponentAnnotationModel.class);
        configApplicationContext.refresh();
        ComponentAnnotationModel model = configApplicationContext.getBean(ComponentAnnotationModel.class);
        System.out.println(PrintUtil.formatTestResult(model));
        configApplicationContext.destroy();
    }

    @Test
    public void testConstructContainerWithConfigBean() throws Exception {
        AnnotationConfigApplicationContext configApplicationContext = beanFactory.constructContainerWithConfigBean(
                ComponentAnnotationModel.class, ServiceAnnotationModel.class, ServiceAnnotationModel.class);
        ServiceAnnotationModel model = configApplicationContext.getBean(ServiceAnnotationModel.class);
        System.out.println(PrintUtil.formatTestResult(model));
        configApplicationContext.destroy();
    }

    @Test
    public void testConstructContainerWithBasePackage() throws Exception {
        AnnotationConfigApplicationContext configApplicationContext = beanFactory.constructContainerWithBasePackage(
                "org.springframework.samples.model.annotation");
        configApplicationContext.refresh();
        ComponentAnnotationModel model = configApplicationContext.getBean(ComponentAnnotationModel.class);
        System.out.println(PrintUtil.formatTestResult(model));
        configApplicationContext.destroy();
    }
}