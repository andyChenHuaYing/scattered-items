package org.springframework.samples.ioc.schema.injection.autowire;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class SingleAutowireBeanTest extends TestBase {
    public SingleAutowireBeanTest() {
        super("spring-ioc-schema-autowired-dependency.xml");
    }

    @Test
    public void testSingleAutowireBean() {
        SingleAutowireBean singleAutowireBean = getBean(SingleAutowireBean.class);
        System.out.println(PrintUtil.formatTestResult(singleAutowireBean));
    }
}