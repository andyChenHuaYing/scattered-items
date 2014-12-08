package org.springframework.samples.ioc;

import org.springframework.samples.utils.OrderUtils;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-17 20:08
 */
public class AccountDao {
    public AccountDao() {
        System.out.println("order : " + OrderUtils.order++ + "  : " + this.getClass().getName() + " is instantiated....");
    }


}
