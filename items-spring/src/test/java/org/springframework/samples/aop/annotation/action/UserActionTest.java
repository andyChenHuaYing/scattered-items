package org.springframework.samples.aop.annotation.action;

import org.junit.Test;
import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.utils.UserFactoryUtil;
import org.springframework.samples.testbase.TestBase;

public class UserActionTest extends TestBase{
    private UserAction userAction;
    private User user = UserFactoryUtil.createDefaultUser();
    private String description = "Happy family";

    public UserActionTest() {
        super("spring-aop-aspectj.xml");
    }

    @Test
    public void testAddUser() {
        getUserAction().addUser(user);
    }

    @Test
    public void testCheckUserInfo() throws Exception {
        getUserAction().checkUserInfo(user);

    }

    @Test
    public void testDemonstrateExecutionPattern() throws Exception {
        getUserAction().demonstrateExecutionPattern(user, description);
    }

    @Test
    public void testDemonstrateOtherPointcutPatternExpression() throws Exception {
        getUserAction().demonstrateOtherPointcutPatternExpression(user, description);
    }

    private UserAction getUserAction() {
        if (userAction != null) {
            return userAction;
        } else {
            userAction = getBean(UserAction.class);
            return userAction;
        }
    }

    @Test
    public void testDemonstrateAdviceUsage() throws Exception {
        getUserAction().demonstrateAfterThrowingAdviceUsage(user, description);
    }
}