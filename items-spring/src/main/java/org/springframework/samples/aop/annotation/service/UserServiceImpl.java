package org.springframework.samples.aop.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.aop.annotation.annotation.CustomTransaction;
import org.springframework.samples.aop.annotation.dao.UserDao;
import org.springframework.samples.aop.dto.User;
import org.springframework.stereotype.Service;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:09
 */
@Service
@CustomTransaction
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User proceedUser(User user, String description) {
        return userDao.proceedUser(user, description);
    }
}
