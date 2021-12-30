package org.nanshan.design.pattern.strategy.common.context;

import org.nanshan.design.pattern.strategy.common.strategy.Strategy;

/**
 * Description : 上下文or执行器
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }
}
