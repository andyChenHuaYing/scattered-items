package org.springframework.samples.data.access.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.data.access.template.service.UserService;
import org.springframework.samples.model.User;
import org.springframework.stereotype.Controller;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/12.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void addUser(User user) {
        userService.addUser(user);
    }

    public User getUser(String userName) {
        return userService.getUser(userName);
    }

    public int countUser() {
        return userService.getUserCount();
    }
}
