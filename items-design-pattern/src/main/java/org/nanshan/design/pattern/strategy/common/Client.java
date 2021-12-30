package org.nanshan.design.pattern.strategy.common;

import org.nanshan.design.pattern.strategy.common.context.Context;
import org.nanshan.design.pattern.strategy.common.strategy.ConcreteStrategyA;
import org.nanshan.design.pattern.strategy.common.strategy.ConcreteStrategyB;

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
