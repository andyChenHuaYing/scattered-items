package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.ioc.schema.instantiation.lazy.init.LazyInitBean;
import org.springframework.samples.testbase.TestBase;

public class LazyInitBeanTest extends TestBase{
    public LazyInitBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-lazy-init.xml");
    }

    @Test
    public void testLazyInit() throws Exception {
    }

    @Test
    public void testLazyInitTwo() throws Exception {
        getBean(LazyInitBean.class);
    }

    @Test
    public void testNoLazyBeanWithAlazyBean() throws Exception {
    }
}