package org.nanshan.design.pattern.bridge.demo.corp;

import org.nanshan.design.pattern.bridge.demo.product.HouseProduct;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class HouseCorp extends Corp {
    public HouseCorp(HouseProduct h) {
        super(h);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("HouseCorp.makeMoney");
    }
}
