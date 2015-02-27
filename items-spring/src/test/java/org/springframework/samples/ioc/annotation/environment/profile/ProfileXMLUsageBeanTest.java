package org.springframework.samples.ioc.annotation.environment.profile;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.testbase.AnnotationConfigApplicationContextBeanFactoryTestBase;
import org.springframework.samples.utils.PrintUtil;

public class ProfileXMLUsageBeanTest extends AnnotationConfigApplicationContextBeanFactoryTestBase {

    @Test
    public void testToString() throws Exception {
        AnnotationConfigApplicationContext context = beanFactory.simpleConstructContainer();
        // the default profile will not work if there are some active profile in environment.
        context.getEnvironment().setActiveProfiles("profileDevConfig", "profileProductConfig");
        context.register(ProfileXMLUsageBean.class);
        context.refresh();
        ProfileXMLUsageBean profileXMLUsageBean = context.getBean(ProfileXMLUsageBean.class);
        System.out.println(PrintUtil.formatTestResult(profileXMLUsageBean));
    }
}