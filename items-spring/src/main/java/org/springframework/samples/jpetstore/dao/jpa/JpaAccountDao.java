package org.springframework.samples.jpetstore.dao.jpa;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-14 18:35
 */
public class JpaAccountDao {
    public void saveAccount(String name, String password) {
        System.out.println(this.getClass().getName() + " :: name : " + name + ", password : " + password);
    }
}
