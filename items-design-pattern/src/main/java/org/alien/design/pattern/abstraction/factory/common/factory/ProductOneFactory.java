package org.alien.design.pattern.abstraction.factory.common.factory;

import org.alien.design.pattern.abstraction.factory.common.product.ProductA;
import org.alien.design.pattern.abstraction.factory.common.product.ProductAOne;
import org.alien.design.pattern.abstraction.factory.common.product.ProductB;
import org.alien.design.pattern.abstraction.factory.common.product.ProductBOne;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public class ProductOneFactory extends AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductAOne();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBOne();
    }
}
