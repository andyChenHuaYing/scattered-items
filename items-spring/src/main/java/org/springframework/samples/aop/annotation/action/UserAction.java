package org.springframework.samples.aop.annotation.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.aop.annotation.annotation.CustomDeprecatedAnnotation;
import org.springframework.samples.aop.annotation.service.SuperActionService;
import org.springframework.samples.aop.annotation.service.UserService;
import org.springframework.samples.aop.dto.User;
import org.springframework.samples.exceptions.ProceedFailException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-10 20:08
 */
@Component
public class UserAction implements SuperActionService {

    @Autowired
    private UserService userService;

    public void addUser(User user) {
        userService.addUser(user);
    }


    /**
     * Validate As a consequence, any given pointcut will be matched against public method only.
     * The aop still could apply, the "public" means pointcut execution modifiers-pattern is just public.
     *
     * @param user User info.
     */
    protected void checkUserInfo(User user) {
        if (StringUtils.isEmpty(user.getUserName())) {
            System.out.println("user name is null");
            return;
        } else if (StringUtils.isEmpty(user.getPassword())) {
            System.out.println("password is null");
            return;
        }
        System.out.println("user info qualified...");
    }

    /**
     * Demonstrate execution expression of pointcut
     *
     * @param user        User info.
     * @param description User's noted information.
     */
    public void demonstrateExecutionPattern(User user, String description) {
        System.out.println(user + ", description : " + description);
    }

    /**
     * Demonstrate other pointcut expression pattern :
     * within, target, this, args, @within, @target, @args, @annotation and the spacial for Spring AOP--bean.
     * All of these expression are defined in TransactionAspect class.
     *
     * @param user        User info.
     * @param description User's noted information.
     * @return User info, just be used in obtain JoinPoint's return value.
     */
    @CustomDeprecatedAnnotation
    public User demonstrateOtherPointcutPatternExpression(User user, String description) {
        userService.proceedUser(user, description);
        System.out.println(user + ", description : " + description);
        return userService.proceedUser(user, description);
    }

    /**
     * Demonstrate the usage of after throwing advice and transfer the Exception to aspect as an parameter.
     *
     * @param user User info.
     * @param des  User's noted information.
     * @return User info, just be used in obtain JoinPoint's return value.
     */
    public User demonstrateAfterThrowingAdviceUsage(User user, String des) {
        System.out.println(user + ", description : " + des);
        throw new ProceedFailException("proceed fail");
    }
}
