package org.alien.design.pattern.factory.extention.simple.factory;

import org.alien.design.pattern.factory.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public abstract class SimpleFactory {

    public static <T extends Product> T createProduct(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}
