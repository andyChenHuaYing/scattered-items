package org.springframework.samples.jpetstore.serviceImpl;

import org.junit.Test;
import org.springframework.samples.jpetstore.services.AccountService;
import org.springframework.samples.testbase.TestBase;

public class AccountServiceImpleTest extends TestBase{

    @Test
    public void testSaveAccount() throws Exception {
        AccountService accountService = getBean("accountService");
        accountService.saveAccount("Andy", "firefox");
    }
}