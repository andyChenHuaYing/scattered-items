package org.springframework.samples.ioc.schema.injection.method;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class LookUpMethodBeanTest extends TestBase {

    public LookUpMethodBeanTest() {
        super("spring-ioc-schema-lookup-method.xml");
    }

    @Test
    public void testToString() throws Exception {
        LookUpMethodBean lookUpMethodBean = getBean("lookUpMethodBean", LookUpMethodBean.class);
        System.out.println(PrintUtil.formatTestResult(lookUpMethodBean));
    }
}