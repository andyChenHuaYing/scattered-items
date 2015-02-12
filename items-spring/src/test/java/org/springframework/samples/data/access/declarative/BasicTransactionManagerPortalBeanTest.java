package org.springframework.samples.data.access.declarative;

import org.junit.Test;
import org.springframework.samples.aop.utils.UserFactory;
import org.springframework.samples.data.access.template.controller.UserController;
import org.springframework.samples.testbase.TestBase;

public class BasicTransactionManagerPortalBeanTest extends TestBase {
    public BasicTransactionManagerPortalBeanTest() {
        super("spring_configuration/data.access.declarative/spring-ioc-annotation-component-scan.xml");
    }

    @Test
    public void testTransactionManager() throws Exception {
        UserController userController = getBean(UserController.class);
        userController.addUser(UserFactory.createUserModel());
    }
}