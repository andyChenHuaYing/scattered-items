package org.nanshan.design.pattern.strategy.demo.normal.strategy;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class AddStrategy extends CalculateStrategy {

    @Override
    public int exe(int a, int b) {
        return a + b;
    }
}
