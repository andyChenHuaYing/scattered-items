package org.alien.design.pattern.strategy.common.strategy;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("ConcreteStrategyB.doSomething");
    }
}
