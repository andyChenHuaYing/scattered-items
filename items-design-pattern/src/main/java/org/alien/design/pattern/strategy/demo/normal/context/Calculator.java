package org.alien.design.pattern.strategy.demo.normal.context;

import org.alien.design.pattern.strategy.demo.normal.strategy.CalculateStrategy;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Calculator {

    private CalculateStrategy calculateStrategy;

    public Calculator(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int exe(int a, int b) {
        return this.calculateStrategy.exe(a, b);
    }
}
