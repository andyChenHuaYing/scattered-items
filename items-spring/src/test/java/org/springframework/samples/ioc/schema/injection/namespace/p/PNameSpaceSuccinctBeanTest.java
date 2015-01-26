package org.springframework.samples.ioc.schema.injection.namespace.p;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class PNameSpaceSuccinctBeanTest extends TestBase {
    public PNameSpaceSuccinctBeanTest() {
        super("spring-ioc-schema-p-namespace-succinct.xml");
    }

    @Test
    public void testToString() throws Exception {
        PNameSpaceSuccinctBean pNameSpaceSuccinctBean = getBean(PNameSpaceSuccinctBean.class);
        System.out.println(PrintUtil.formatTestResult(pNameSpaceSuccinctBean));
    }
}