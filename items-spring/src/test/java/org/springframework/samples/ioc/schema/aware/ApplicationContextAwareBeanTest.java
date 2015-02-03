package org.springframework.samples.ioc.schema.aware;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class ApplicationContextAwareBeanTest extends TestBase {
    public ApplicationContextAwareBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-aware.xml");
    }

    @Test
    public void testToString() throws Exception {
        ApplicationContextAwareBean applicationContextAwareBean = getBean(ApplicationContextAwareBean.class);
        System.out.println(PrintUtil.formatTestResult(applicationContextAwareBean));

    }
}