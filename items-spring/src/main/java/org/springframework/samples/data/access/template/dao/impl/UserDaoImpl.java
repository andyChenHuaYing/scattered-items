package org.springframework.samples.data.access.template.dao.impl;

import org.springframework.samples.data.access.template.dao.UserDao;
import org.springframework.samples.model.User;
import org.springframework.stereotype.Repository;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/12.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) {
        throw new RuntimeException();
    }

    @Override
    public User getUser(String name) {
        throw new RuntimeException();
    }

    @Override
    public int getUserCount() {
        throw new RuntimeException();
    }
}
