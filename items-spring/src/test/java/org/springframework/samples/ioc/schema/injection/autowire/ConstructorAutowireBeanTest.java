package org.springframework.samples.ioc.schema.injection.autowire;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class ConstructorAutowireBeanTest extends TestBase {

    public ConstructorAutowireBeanTest() {
        super("spring-ioc-schema-autowired-dependency.xml");
    }

    @Test
    public void testToString() throws Exception {
        ConstructorAutowireBean constructorAutowireBean = getBean(ConstructorAutowireBean.class);
        System.out.println(PrintUtil.formatTestResult(constructorAutowireBean));

    }
}