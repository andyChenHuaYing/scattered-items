package org.springframework.samples.aop.programmatic;

import org.junit.Before;
import org.junit.Test;

public class ProgrammaticProxyBeanTest {

    private ProgrammaticProxyBean programmaticProxyBean;

    @Before
    public void before() {
        programmaticProxyBean = new ProgrammaticProxyBean();
    }

    @Test
    public void testCreateProxy() throws Exception {
        ITargetObject object = programmaticProxyBean.createProxy(new TargetObject());
        object.targetPlainMethod();
    }
}