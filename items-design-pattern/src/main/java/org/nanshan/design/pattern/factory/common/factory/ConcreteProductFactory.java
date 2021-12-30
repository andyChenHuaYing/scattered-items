package org.nanshan.design.pattern.factory.common.factory;

import org.nanshan.design.pattern.factory.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class ConcreteProductFactory extends ProductFactory {
    @Override
    public <T extends Product> T createProduct(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}
