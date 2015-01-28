package org.springframework.samples.ioc.schema.container.extension;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.ExecutionOrderUtil;
import org.springframework.samples.utils.PrintUtil;

public class BeanPostProcessorTest extends TestBase {

    public BeanPostProcessorTest() {
        super("spring-ioc-schema-custom-container-extension.xml");
    }

    @Test
    public void testBeanPostProcessorViaXml() throws Exception {
        System.out.println(PrintUtil.formatTestResult(ExecutionOrderUtil.getRecordMap()));
    }
}