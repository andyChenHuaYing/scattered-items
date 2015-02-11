package org.springframework.samples.template.service;

import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.schema.dao.UserDao;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:09
 */
@SuppressWarnings("unused")
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
