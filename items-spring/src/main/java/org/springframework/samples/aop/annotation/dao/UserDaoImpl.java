package org.springframework.samples.aop.annotation.dao;

import org.springframework.samples.aop.dto.User;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:12
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println(this.getClass().getSimpleName() + " add user : " + user.toString());
    }
}
