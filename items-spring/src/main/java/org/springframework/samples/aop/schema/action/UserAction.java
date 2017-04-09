package org.springframework.samples.aop.schema.action;

import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.schema.service.UserService;
import org.springframework.samples.exceptions.ProceedFailException;
import org.springframework.util.StringUtils;

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
     *
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

    protected boolean checkUserInfo(User user) {
        if (StringUtils.isEmpty(user.getUserName())) {
            System.out.println("user name is null...");
            return false;
        } else if (StringUtils.isEmpty(user.getPassword())) {
            System.out.println("password is null...");
            return false;
        }
        return true;
    }
}