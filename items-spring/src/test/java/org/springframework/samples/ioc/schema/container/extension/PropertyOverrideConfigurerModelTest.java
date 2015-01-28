package org.springframework.samples.ioc.schema.container.extension;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class PropertyOverrideConfigurerModelTest extends TestBase {

    public PropertyOverrideConfigurerModelTest() {
        super("spring-ioc-schema-property-override-configure.xml");
    }

    @Test
    public void testToString() throws Exception {
        PropertyOverrideConfigurerModel model = getBean(PropertyOverrideConfigurerModel.class);
        System.out.println(PrintUtil.formatTestResult(model));
    }
}