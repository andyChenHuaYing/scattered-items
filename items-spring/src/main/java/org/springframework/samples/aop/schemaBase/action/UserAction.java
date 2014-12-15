package org.springframework.samples.aop.schemaBase.action;

import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.schemaBase.service.UserService;
import org.springframework.samples.exceptions.ProceedFailException;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-09 19:23
 */
public class UserAction {
    private UserService userService;

    /**
     * Add user.
     * @param user Detail user.
     */
    public void addUser(User user) throws ProceedFailException {
        userService.addUser(user);
    }

    public void addUser(String userName, String password) {
        userService.addUser(userName, password);
    }

    public User getUser(int userId) {
        return userService.getUser(userId);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
