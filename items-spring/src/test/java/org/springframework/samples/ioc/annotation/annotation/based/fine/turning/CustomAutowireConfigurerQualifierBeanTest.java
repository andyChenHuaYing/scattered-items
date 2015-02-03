package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class CustomAutowireConfigurerQualifierBeanTest extends TestBase {
    public CustomAutowireConfigurerQualifierBeanTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-qualifier-custom-autowire-configurer.xml");
    }

    @Test
    public void testToString() throws Exception {
        CustomAutowireConfigurerQualifierBean bean = getBean(CustomAutowireConfigurerQualifierBean.class);
        System.out.println(PrintUtil.formatTestResult(bean));
    }
}