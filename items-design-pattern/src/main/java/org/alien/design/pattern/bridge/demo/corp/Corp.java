package org.alien.design.pattern.bridge.demo.corp;

import org.alien.design.pattern.bridge.demo.product.Product;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProductd();
        this.product.beSelled();
    }
}
