package org.springframework.samples.aop.schema.action;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.schema.introduction.FilterService;
import org.springframework.samples.aop.utils.UserFactory;
import org.springframework.samples.testbase.TestBase;

public class UserActionTest extends TestBase{
    private UserAction userAction;
    private User user = UserFactory.createDefaultUser();

    public UserActionTest() {
        super("spring_configuration/aop/spring-aop-schema-base.xml");
    }

    @Test
    public void testAddUser() throws Throwable {
        getUserAction().addUser(user);
    }

    @Test
    public void testAddUserByPrimaryParameters() throws Throwable {
        getUserAction().getUser(-1);
    }

    @Test
    public void testAddUserByReferenceParameters() throws Throwable {
        getUserAction().addUser(user);
    }

    @Test
    public void testIntroduction() throws Exception {
        FilterService filterService = (FilterService) getUserAction();
        filterService.filter();
    }

    @Test
    public void testCheckUserAction() throws Exception {
        Assert.assertEquals(true, getUserAction().checkUserInfo(user));

    }

    /**
     * Instantiated UserAction;
     * @return Instantiation of UserAction.
     */
    private UserAction getUserAction() {
        if (this.userAction != null) {
            return userAction;
        } else {
            this.userAction = getBean(UserAction.class);
        }
        return userAction;
    }
}