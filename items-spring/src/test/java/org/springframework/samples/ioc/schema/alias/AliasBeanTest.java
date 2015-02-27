package org.springframework.samples.ioc.schema.alias;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class AliasBeanTest extends TestBase {

    public AliasBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-alias-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        System.out.println(PrintUtil.formatTestResult(context.getAliases("aliasBean")));

    }
}