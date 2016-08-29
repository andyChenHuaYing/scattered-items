package org.alien.design.pattern.decorator.common.decorator;

import org.alien.design.pattern.decorator.common.component.Component;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void decoratorMethodInB() {
        System.out.println("ConcreteDecoratorB.decoratorMethodInB");
    }

    @Override
    public void operate() {
        this.decoratorMethodInB();
        super.operate();
    }
}
