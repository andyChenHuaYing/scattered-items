package org.springframework.samples.aop.annotation.dao;

import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.utils.UserFactoryUtil;
import org.springframework.stereotype.Repository;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:12
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println(this.getClass().getSimpleName() + " add user : " + user.toString());
    }

    @Override
    public User proceedUser(User user, String description) {
        return UserFactoryUtil.createDefaultUser();
    }
}
