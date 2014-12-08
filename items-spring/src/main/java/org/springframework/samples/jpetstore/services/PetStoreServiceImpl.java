package org.springframework.samples.jpetstore.services;

import org.springframework.samples.jpetstore.dao.jpa.JpaAccountDao;
import org.springframework.samples.jpetstore.dao.jpa.JpaItemDao;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-14 18:36
 */
public class PetStoreServiceImpl {
    private JpaAccountDao accountDao;
    private JpaItemDao itemDao;

    public void savePetInfo(String name, String password, String itemName) {
        accountDao.saveAccount(name, password);
        itemDao.saveItem(itemName);
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
