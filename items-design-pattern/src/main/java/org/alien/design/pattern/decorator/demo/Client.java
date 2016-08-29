package org.alien.design.pattern.decorator.demo;

import org.alien.design.pattern.decorator.demo.component.FileInputStreamComponent;
import org.alien.design.pattern.decorator.demo.component.InputStreamComponent;
import org.alien.design.pattern.decorator.demo.decotrator.InputStreamDecoratorImpl;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Client {
    public static void main(String[] args) {
        InputStreamComponent inputStreamComponent = new FileInputStreamComponent();
        InputStreamDecoratorImpl inputStreamDecorator = new InputStreamDecoratorImpl(inputStreamComponent);
        inputStreamDecorator.readDecorator();
        inputStreamDecorator.closeDecorator();
    }
}
