package org.springframework.samples.ioc.schema.injection.method;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class MethodReplacerRawBeanTest extends TestBase {

    public MethodReplacerRawBeanTest() {
        super("spring-ioc-schema-replace-method.xml");
    }

    @Test
    public void testReplacedMethod() throws Exception {
        MethodReplacerRawBean methodReplacerRawBean = getBean(MethodReplacerRawBean.class);
        System.out.println(PrintUtil.formatTestResult(
                methodReplacerRawBean.replacedMethod("original string parameter")));
    }
}