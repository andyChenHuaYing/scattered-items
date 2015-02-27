package org.springframework.samples.ioc.annotation.environment.profile;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.testbase.AnnotationConfigApplicationContextBeanFactoryTestBase;
import org.springframework.samples.utils.PrintUtil;

public class ProfileAnnotationUsageBeanTest extends AnnotationConfigApplicationContextBeanFactoryTestBase {

    @Test
    public void testToString() throws Exception {
        AnnotationConfigApplicationContext context = beanFactory.simpleConstructContainer();
        // the default profile will not work if there are some active profile in environment.
        context.getEnvironment().setActiveProfiles("profileDevConfig", "profileProductConfig");
        context.scan("org.springframework.samples.ioc.annotation.environment.profile");
        context.refresh();
        ProfileAnnotationUsageBean profileAnnotationUsageBean = context.getBean(ProfileAnnotationUsageBean.class);
        System.out.println(PrintUtil.formatTestResult(profileAnnotationUsageBean));
    }
}