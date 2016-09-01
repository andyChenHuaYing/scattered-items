package org.alien.design.pattern.bridge.common.implementor;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class ConcreteImplA implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("ConcreteImplA.doSomething");
    }

    @Override
    public void doAnyThing() {
        System.out.println("ConcreteImplA.doAnyThing");
    }
}
