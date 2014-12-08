package org.springframework.samples.aop.schameBase.service;

import org.springframework.samples.aop.schameBase.dao.UserDao;
import org.springframework.samples.aop.schameBase.dto.User;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:09
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
