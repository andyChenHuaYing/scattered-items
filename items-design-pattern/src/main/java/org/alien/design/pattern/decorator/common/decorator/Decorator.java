package org.alien.design.pattern.decorator.common.decorator;

import org.alien.design.pattern.decorator.common.component.Component;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public abstract class Decorator extends Component {

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
