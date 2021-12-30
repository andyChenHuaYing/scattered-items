package org.nanshan.design.pattern.factory.demo.factory;

import org.nanshan.design.pattern.factory.demo.product.Human;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public abstract class HumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> clazz) throws IllegalAccessException, InstantiationException;
}
