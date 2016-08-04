package org.alien.design.pattern.factory.demo.factory;

import org.alien.design.pattern.factory.demo.product.Human;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class SimpleHumanFactory extends HumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}
