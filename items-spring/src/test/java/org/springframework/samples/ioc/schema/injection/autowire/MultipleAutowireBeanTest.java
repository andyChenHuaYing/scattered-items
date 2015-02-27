package org.springframework.samples.ioc.schema.injection.autowire;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class MultipleAutowireBeanTest extends TestBase {
    public MultipleAutowireBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-autowired-dependency.xml");
    }

    @Test
    public void testMultipleAutowireBean() {
        MultipleAutowireBean multipleAutowireBean = getBean(MultipleAutowireBean.class);
        System.out.println(PrintUtil.formatTestResult(multipleAutowireBean.getMap()));
        System.out.println(PrintUtil.formatTestResult(multipleAutowireBean.getList()));
        System.out.println(PrintUtil.formatTestResult(multipleAutowireBean.getSet()));
        System.out.println(PrintUtil.formatTestResult(multipleAutowireBean.getAbstractPlainModels()));
    }
}