package org.springframework.samples.aop.schema.service;

import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.schema.dao.UserDao;
import org.springframework.samples.exceptions.ProceedFailException;

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
    public User getUser(int userId) {
        return userDao.getUser(userId);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
        throw new ProceedFailException("custom exception....");
    }

    @Override
    public void addUser(String userName, String password) {
        userDao.addUser(new User(userName, password));
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
