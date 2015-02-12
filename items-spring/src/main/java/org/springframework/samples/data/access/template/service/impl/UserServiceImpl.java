package org.springframework.samples.data.access.template.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.data.access.template.dao.UserDao;
import org.springframework.samples.data.access.template.service.UserService;
import org.springframework.samples.model.User;
import org.springframework.stereotype.Service;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/12.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
        throw new RuntimeException();
    }

    @Override
    public User getUser(String userName) {
        throw new RuntimeException();
    }

    @Override
    public int getUserCount() {
        throw new RuntimeException();
    }


}
