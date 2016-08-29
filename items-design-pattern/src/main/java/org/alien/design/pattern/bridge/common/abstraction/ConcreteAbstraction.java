package org.alien.design.pattern.bridge.common.abstraction;

import org.alien.design.pattern.bridge.common.implementor.Implementor;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class ConcreteAbstraction extends Abstraction {
    public ConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void request() {
        super.request();
        super.getImplementor().doSomething();
        System.out.println("ConcreteAbstraction.request");
    }
}
