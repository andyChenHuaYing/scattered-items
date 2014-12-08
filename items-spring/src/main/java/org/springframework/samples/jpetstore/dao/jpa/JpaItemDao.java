package org.springframework.samples.jpetstore.dao.jpa;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-14 18:35
 */
public class JpaItemDao {
    public void saveItem(String itemName) {
        System.out.println(this.getClass().getName() + " :: itemName : " + itemName);
    }
}
