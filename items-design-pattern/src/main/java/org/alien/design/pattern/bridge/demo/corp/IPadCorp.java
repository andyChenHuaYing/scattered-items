package org.alien.design.pattern.bridge.demo.corp;

import org.alien.design.pattern.bridge.demo.product.IPadProduct;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class IPadCorp extends Corp {
    public IPadCorp(IPadProduct product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("IPadCorp.makeMoney");
    }
}
