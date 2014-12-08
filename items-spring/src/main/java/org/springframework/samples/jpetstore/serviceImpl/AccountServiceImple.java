package org.springframework.samples.jpetstore.serviceImpl;

import org.springframework.samples.jpetstore.services.AccountService;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-14 20:17
 */
public class AccountServiceImple implements AccountService {
    @Override
    public void saveAccount(String name, String password) {
        System.out.println(this.getClass().getName() + " save account :: name : " + name + ", password : " + password);
    }
}
