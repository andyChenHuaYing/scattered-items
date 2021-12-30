package org.nanshan.design.pattern.bridge.demo.product;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class HouseProduct extends Product {
    @Override
    public void beProductd() {
        System.out.println("HouseProduct.beProductd");
    }

    @Override
    public void beSelled() {
        System.out.println("HouseProduct.beSelled");
    }
}
