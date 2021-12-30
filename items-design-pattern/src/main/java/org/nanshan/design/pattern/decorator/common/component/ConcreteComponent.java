package org.nanshan.design.pattern.decorator.common.component;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent.operate");
    }
}
