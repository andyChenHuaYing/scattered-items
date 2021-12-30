package org.nanshan.design.pattern.bridge.common;

import org.nanshan.design.pattern.bridge.common.abstraction.Abstraction;
import org.nanshan.design.pattern.bridge.common.abstraction.ConcreteAbstraction;
import org.nanshan.design.pattern.bridge.common.implementor.ConcreteImplA;
import org.nanshan.design.pattern.bridge.common.implementor.ConcreteImplB;

/**
 * @author oscar
 * Create Data: 29/08/16
 */
public class Client {

    public static void main(String[] args) {
        Abstraction abstractionA = new ConcreteAbstraction(new ConcreteImplA());
        abstractionA.request();

        Abstraction abstractionB = new ConcreteAbstraction(new ConcreteImplB());
        abstractionB.request();
    }
}
