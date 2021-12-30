package org.nanshan.design.pattern.factory.extention.simple.factory;

import org.nanshan.design.pattern.factory.common.product.ConcreteProductA;
import org.nanshan.design.pattern.factory.common.product.ConcreteProductB;
import org.nanshan.design.pattern.factory.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Product productA = SimpleFactory.createProduct(ConcreteProductA.class);
        Product productB = SimpleFactory.createProduct(ConcreteProductB.class);
        productA.doSomethingCommon();
        productA.doSomethingDetail();
        productB.doSomethingCommon();
        productB.doSomethingDetail();

    }
}
