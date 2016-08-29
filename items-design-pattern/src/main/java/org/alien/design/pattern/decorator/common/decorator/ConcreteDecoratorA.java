package org.alien.design.pattern.decorator.common.decorator;

import org.alien.design.pattern.decorator.common.component.Component;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void decoratorMethodInA() {
        System.out.println("ConcreteDecoratorA.decoratorMethodInA");
    }

    @Override
    public void operate() {
        this.decoratorMethodInA();
        super.operate();
    }
}
