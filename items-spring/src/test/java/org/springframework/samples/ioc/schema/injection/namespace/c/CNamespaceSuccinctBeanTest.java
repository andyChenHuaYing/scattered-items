package org.springframework.samples.ioc.schema.injection.namespace.c;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class CNamespaceSuccinctBeanTest extends TestBase {
    public CNamespaceSuccinctBeanTest() {
        super("spring-ioc-schema-c-namespace-succinct.xml");
    }

    @Test
    public void testToString() throws Exception {
        CNamespaceSuccinctBean cNamespaceSuccinctBean = getBean(CNamespaceSuccinctBean.class);
        System.out.println(PrintUtil.formatTestResult(cNamespaceSuccinctBean));
    }
}