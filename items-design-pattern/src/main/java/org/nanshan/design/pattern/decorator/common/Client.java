package org.nanshan.design.pattern.decorator.common;

import org.nanshan.design.pattern.decorator.common.component.Component;
import org.nanshan.design.pattern.decorator.common.component.ConcreteComponent;
import org.nanshan.design.pattern.decorator.common.decorator.ConcreteDecoratorA;
import org.nanshan.design.pattern.decorator.common.decorator.ConcreteDecoratorB;
import org.nanshan.design.pattern.decorator.common.decorator.Decorator;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class Client {

    /**
     * Decorator 注意装饰顺序
     */
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operate();
        System.out.println("-----------------------------------------------------------");

        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operate();
        System.out.println("-----------------------------------------------------------");

        Decorator decoratorAA = new ConcreteDecoratorA(decoratorA);
        decoratorAA.operate();
        System.out.println("-----------------------------------------------------------");

        Decorator decoratorAAA = new ConcreteDecoratorA(decoratorAA);
        decoratorAAA.operate();
        System.out.println("-----------------------------------------------------------");

        Decorator decoratorBAAA = new ConcreteDecoratorB(decoratorAAA);
        decoratorBAAA.operate();
    }
}
