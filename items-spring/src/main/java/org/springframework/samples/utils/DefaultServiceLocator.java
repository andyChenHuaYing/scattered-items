package org.springframework.samples.utils;

import org.springframework.samples.jpetstore.examples.ClientServiceImpl;
import org.springframework.samples.jpetstore.serviceImpl.AccountServiceImple;
import org.springframework.samples.jpetstore.services.AccountService;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-14 20:05
 */
public class DefaultServiceLocator {
    private static ClientServiceImpl clientServiceImpl = new ClientServiceImpl();
    private static AccountService accountService = new AccountServiceImple();

    public DefaultServiceLocator() { }

    public AccountService createAccountServiceImplInstance() {
        return accountService;
    }
    public ClientServiceImpl createClientServiceImplInstance() {
        return clientServiceImpl;
    }
}
