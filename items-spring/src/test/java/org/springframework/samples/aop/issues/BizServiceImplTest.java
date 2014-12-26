package org.springframework.samples.aop.issues;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class BizServiceImplTest extends TestBase{
    public BizServiceImplTest() {
        super("spring-aop.xml");
    }

    @Test
    public void testProxiedMethod() throws Exception {
        BizService bizService = getBean("bizServiceImpl");
        bizService.proxiedMethod();
        bizService.withoutThisMethod();
    }
}