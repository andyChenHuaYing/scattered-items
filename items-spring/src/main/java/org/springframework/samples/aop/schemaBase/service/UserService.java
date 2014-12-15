package org.springframework.samples.aop.schemaBase.service;

import org.springframework.samples.aop.dto.User;
import org.springframework.samples.exceptions.ProceedFailException;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:05
 */
public interface UserService {
    void addUser(User user) throws ProceedFailException;

    void addUser(String userName, String password);

    User getUser(int userId);
}
