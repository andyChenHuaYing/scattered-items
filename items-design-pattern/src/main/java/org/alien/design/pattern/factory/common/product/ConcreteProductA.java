package org.alien.design.pattern.factory.common.product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class ConcreteProductA extends Product {

    @Override
    public void doSomethingDetail() {
        System.out.println("ConcreteProductA.doSomethingDetail");
    }

    @Override
    public void doSomethingCommon() {
        super.doSomethingCommon();
    }
}
