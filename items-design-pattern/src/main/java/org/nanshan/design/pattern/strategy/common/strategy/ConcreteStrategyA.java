package org.nanshan.design.pattern.strategy.common.strategy;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("ConcreteStrategyA.doSomething");
    }
}
