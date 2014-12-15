package org.springframework.samples.aop.annotation.action;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.annotations.dto.User;

public class UserActionTest {

    @Test
    public void testAddUser() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-aspectj.xml");
        UserAction userAction = context.getBean(UserAction.class);
        userAction.addUser(new User("andy", "star"));
    }
}