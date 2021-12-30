package org.nanshan.design.pattern.factory.extention.multi.factory;

import org.nanshan.design.pattern.factory.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class Client {

    public static void main(String[] args) {
        ConcreteProductAFactory productAFactory = new ConcreteProductAFactory();
        Product productA = productAFactory.createProduct();
        productA.doSomethingDetail();
        productA.doSomethingCommon();

        ConcreteProductBFactory productBFactory = new ConcreteProductBFactory();
        Product productB = productBFactory.createProduct();
        productB.doSomethingDetail();
        productB.doSomethingCommon();
    }
}
