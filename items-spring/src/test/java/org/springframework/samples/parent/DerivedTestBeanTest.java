package org.springframework.samples.parent;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class DerivedTestBeanTest extends TestBase {
    public DerivedTestBeanTest() {
        super("spring-parent.xml");
    }

    @Test
    public void testParent() throws Exception {
//        getBean(TestBean.class);
        DerivedTestBean derivedTestBean = getBean(DerivedTestBean.class);
        derivedTestBean.info();

    }
}