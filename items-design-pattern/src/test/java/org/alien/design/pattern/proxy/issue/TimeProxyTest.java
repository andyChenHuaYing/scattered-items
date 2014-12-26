package org.alien.design.pattern.proxy.issue;

import org.junit.Before;

public class TimeProxyTest {
    private BizInterface bizInterface;

    @Before
    public void before() {
        bizInterface = new TimeProxy(new ProxiedClass());
    }

    @org.junit.Test
    public void testName() throws Exception {
        bizInterface.proxiedMethod();
    }
}