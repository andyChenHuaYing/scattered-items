package org.springframework.samples.aop.schemaBase.action;

import org.junit.Test;
import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.schemaBase.introduction.FilterService;
import org.springframework.samples.testbase.TestBase;

public class UserActionTest extends TestBase{
    public UserActionTest() {
        super("spring-aop-schema-base.xml");
    }

    @Test
    public void testAddUser() throws Throwable {
        UserAction userAction = getBean(UserAction.class);
        userAction.addUser(new User("andy", "star"));
    }

    @Test
    public void testAddUserByPrimaryParameters() throws Throwable {
        UserAction userAction = getBean(UserAction.class);
        userAction.getUser(-1);
    }

    @Test
    public void testAddUserByReferenceParameters() throws Throwable {
        UserAction userAction = getBean(UserAction.class);
        userAction.addUser(new User("andy", "star"));
    }

    @Test
    public void testIntroduction() throws Exception {
        FilterService filterService = (FilterService) getBean(UserAction.class);
        filterService.filter();
    }
}