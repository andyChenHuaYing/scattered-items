package org.springframework.samples.ioc.schema.injection.compound.property;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class CompoundPropertyBeanTest extends TestBase {

    public CompoundPropertyBeanTest() {
        super("spring-ioc-schema-compound-property-bean-injection.xml");
    }

    @Test
    public void testToString() throws Exception {
        CompoundPropertyBean compoundPropertyBean = getBean(CompoundPropertyBean.class);
        System.out.println(PrintUtil.formatTestResult(
                compoundPropertyBean.getPlainModelTwoSingleton().getInnerBeanModel().getInnerBeanModelStr()));

    }
}