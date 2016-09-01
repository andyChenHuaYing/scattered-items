package org.alien.design.pattern.strategy.common;

import org.alien.design.pattern.strategy.common.context.Context;
import org.alien.design.pattern.strategy.common.strategy.ConcreteStrategyA;
import org.alien.design.pattern.strategy.common.strategy.ConcreteStrategyB;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.doAnything();

        context = new Context(new ConcreteStrategyB());
        context.doAnything();
    }
}
