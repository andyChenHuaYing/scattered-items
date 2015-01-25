package org.springframework.samples.ioc.schema.instantiate.basic;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class NormalInstantiateBeanTest extends TestBase{
    public NormalInstantiateBeanTest() {
        super("spring-ioc-basic-instantiate-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        NormalInstantiateBean bean = getBean(NormalInstantiateBean.class);
        System.out.println(PrintUtil.formatTestResult(bean));
    }
}