package org.alien.design.pattern.bridge.common.abstraction;


import org.alien.design.pattern.bridge.common.implementor.Implementor;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public abstract class Abstraction {

    private Implementor implementor;


    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request() {
        this.implementor.doAnyThing();
    }

    public Implementor getImplementor() {
        return implementor;
    }
}
