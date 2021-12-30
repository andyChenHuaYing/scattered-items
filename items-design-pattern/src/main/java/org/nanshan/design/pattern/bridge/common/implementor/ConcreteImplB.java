package org.nanshan.design.pattern.bridge.common.implementor;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class ConcreteImplB implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("ConcreteImplB.doSomething");
    }

    @Override
    public void doAnyThing() {
        System.out.println("ConcreteImplB.doAnyThing");
    }
}
