package org.springframework.samples.aop.utils;

import org.springframework.samples.aop.dto.User;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-17 22:50
 */
public class UserFactory {
    public static User createDefaultUser() {
        return new User("andy", "star");
    }

    public static org.springframework.samples.model.User createUserModel() {
        return new org.springframework.samples.model.User("andy", 25);
    }
}
