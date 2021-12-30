package org.nanshan.design.pattern.flyweight.common.model;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println("ConcreteFlyweight.operate");
    }
}
