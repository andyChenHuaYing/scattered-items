package org.springframework.samples.data.access.template.dao;

import org.springframework.samples.model.User;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/12.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public interface UserDao {

    void addUser(User user);

    User getUser(String name);

    int getUserCount();
}
