package org.nanshan.design.pattern.strategy.demo.normal;

import org.nanshan.design.pattern.strategy.demo.normal.context.Calculator;
import org.nanshan.design.pattern.strategy.demo.normal.strategy.AddStrategy;
import org.nanshan.design.pattern.strategy.demo.normal.strategy.DelStrategy;

/**
 * Description : 策略模式
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println(calculator.exe(1, 2));
        calculator = new Calculator(new DelStrategy());
        System.out.println(calculator.exe(1, 2));
    }
}
