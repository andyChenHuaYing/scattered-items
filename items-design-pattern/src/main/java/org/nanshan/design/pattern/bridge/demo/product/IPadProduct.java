package org.nanshan.design.pattern.bridge.demo.product;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class IPadProduct extends Product {
    @Override
    public void beProductd() {
        System.out.println("IPadProduct.beProductd");
    }

    @Override
    public void beSelled() {
        System.out.println("IPadProduct.beSelled");
    }
}
