package org.springframework.samples.ioc.schema.alias;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

import java.util.Arrays;

public class WithoutIdBeanTest extends TestBase {
    public WithoutIdBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-alias-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        System.out.println(PrintUtil.formatTestResult(Arrays.toString(context.getBeanDefinitionNames())));
        //System.out.println(PrintUtil.formatTestResult(context.getBean("withoutIdBean")));
        System.out.println(PrintUtil.formatTestResult(
                context.getBean("org.springframework.samples.ioc.schema.alias.WithoutIdBean")));
    }
}