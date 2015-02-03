package org.springframework.samples.ioc.schema.container.extension;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class PropertyPlaceholderConfigurerModelTest extends TestBase {

    public PropertyPlaceholderConfigurerModelTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-property-placeholder-configure.xml");
    }

    @Test
    public void testToString() throws Exception {
        System.setProperty("propertyPlaceholderConfigurerModel.strOne", "system_strOne");
        PropertyPlaceholderConfigurerModel model = getBean(PropertyPlaceholderConfigurerModel.class);
        System.out.println(PrintUtil.formatTestResult(model));
    }
}