package org.alien.design.pattern.abstraction.factory.common.factory;

import org.alien.design.pattern.abstraction.factory.common.product.ProductA;
import org.alien.design.pattern.abstraction.factory.common.product.ProductATwo;
import org.alien.design.pattern.abstraction.factory.common.product.ProductB;
import org.alien.design.pattern.abstraction.factory.common.product.ProductBTwo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public class ProductTwoFactory extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductATwo();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBTwo();
    }
}
