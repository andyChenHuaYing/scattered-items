package org.springframework.samples.template.dao;

import org.springframework.samples.aop.schameBase.dao.*;
import org.springframework.samples.aop.schameBase.dto.User;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:12
 */
public class UserDaoImpl implements org.springframework.samples.aop.schameBase.dao.UserDao {
    @Override
    public void addUser(User user) {
        System.out.println(this.getClass().getSimpleName() + " add user : " + user.toString());
    }
}