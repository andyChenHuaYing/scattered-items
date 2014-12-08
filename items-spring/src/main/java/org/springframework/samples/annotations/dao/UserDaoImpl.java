package org.springframework.samples.annotations.dao;

import org.springframework.samples.annotations.dto.User;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-20 22:19
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser(User user) {
        System.out.println();
    }
}
