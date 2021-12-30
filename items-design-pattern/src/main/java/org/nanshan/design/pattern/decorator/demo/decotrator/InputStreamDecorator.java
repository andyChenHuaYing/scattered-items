package org.nanshan.design.pattern.decorator.demo.decotrator;

import org.nanshan.design.pattern.decorator.demo.component.InputStreamComponent;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public abstract class InputStreamDecorator extends InputStreamComponent {
    protected InputStreamComponent inputStreamComponent;

    public InputStreamDecorator(InputStreamComponent inputStreamComponent) {
        this.inputStreamComponent = inputStreamComponent;
    }

    @Override
    public void read() {
        this.inputStreamComponent.read();
    }

    @Override
    public void close() {
        this.inputStreamComponent.close();
    }
}
