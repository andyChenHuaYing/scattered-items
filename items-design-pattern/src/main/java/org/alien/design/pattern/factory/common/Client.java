package org.alien.design.pattern.factory.common;

import org.alien.design.pattern.factory.common.factory.ConcreteProductFactory;
import org.alien.design.pattern.factory.common.factory.ProductFactory;
import org.alien.design.pattern.factory.common.product.ConcreteProductA;
import org.alien.design.pattern.factory.common.product.ConcreteProductB;
import org.alien.design.pattern.factory.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ProductFactory productFactory = new ConcreteProductFactory();
        Product productA = productFactory.createProduct(ConcreteProductA.class);
        Product productB = productFactory.createProduct(ConcreteProductB.class);
        productA.doSomethingDetail();
        productA.doSomethingCommon();
        productB.doSomethingDetail();
        productB.doSomethingCommon();
    }
}
