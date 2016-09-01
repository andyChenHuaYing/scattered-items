package org.alien.design.pattern.strategy.demo.normal;

import org.alien.design.pattern.strategy.demo.normal.context.Calculator;
import org.alien.design.pattern.strategy.demo.normal.strategy.AddStrategy;
import org.alien.design.pattern.strategy.demo.normal.strategy.DelStrategy;

/**
 * Description :
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
