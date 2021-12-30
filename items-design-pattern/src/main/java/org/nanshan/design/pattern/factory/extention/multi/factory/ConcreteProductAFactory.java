package org.nanshan.design.pattern.factory.extention.multi.factory;

import org.nanshan.design.pattern.factory.common.product.ConcreteProductA;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class ConcreteProductAFactory extends ProductFactory<ConcreteProductA> {
    @Override
    public ConcreteProductA createProduct() {
        return new ConcreteProductA();
    }
}
