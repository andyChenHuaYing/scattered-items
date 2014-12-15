package org.springframework.samples.aop.annotation.action;

import org.springframework.samples.annotations.dto.User;
import org.springframework.stereotype.Component;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-10 20:08
 */
@Component
public class UserAction {

    public void addUser(User user) {
        System.out.println("Save user : "  + user);
    }
}
