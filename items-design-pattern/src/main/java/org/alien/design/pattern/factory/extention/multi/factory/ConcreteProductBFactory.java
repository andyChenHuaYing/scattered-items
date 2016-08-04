package org.alien.design.pattern.factory.extention.multi.factory;

import org.alien.design.pattern.factory.common.product.ConcreteProductB;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class ConcreteProductBFactory extends ProductFactory<ConcreteProductB> {
    @Override
    public ConcreteProductB createProduct() {
        return new ConcreteProductB();
    }
}
