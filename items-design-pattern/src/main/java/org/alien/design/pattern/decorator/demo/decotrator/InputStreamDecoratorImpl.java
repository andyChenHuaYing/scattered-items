package org.alien.design.pattern.decorator.demo.decotrator;

import org.alien.design.pattern.decorator.demo.component.InputStreamComponent;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class InputStreamDecoratorImpl extends InputStreamDecorator {

    public InputStreamDecoratorImpl(InputStreamComponent inputStreamComponent) {
        super(inputStreamComponent);
    }

    public void readDecorator() {
        System.out.println("InputStreamDecoratorImpl.read");
        super.read();
    }

    public void closeDecorator() {
        System.out.println("InputStreamDecoratorImpl.close");
        super.close();
    }
}
