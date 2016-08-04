package org.alien.design.pattern.abstraction.factory.common;

import org.alien.design.pattern.abstraction.factory.common.factory.ProductOneFactory;
import org.alien.design.pattern.abstraction.factory.common.factory.ProductTwoFactory;
import org.alien.design.pattern.abstraction.factory.common.product.ProductA;
import org.alien.design.pattern.abstraction.factory.common.product.ProductB;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public class Client {
    public static void main(String[] args) {
        ProductOneFactory productOneFactory = new ProductOneFactory();
        ProductA productAOne = productOneFactory.createProductA();
        ProductB productBOne = productOneFactory.createProductB();
        productAOne.doSomethingDetail();
        productAOne.doSomethingCommon();
        productBOne.doSomethingDetail();
        productBOne.doSomethingCommon();

        ProductTwoFactory productTwoFactory = new ProductTwoFactory();
        ProductA productATwo = productTwoFactory.createProductA();
        ProductB productBTwo = productTwoFactory.createProductB();
        productATwo.doSomethingDetail();
        productATwo.doSomethingCommon();
        productBTwo.doSomethingDetail();
        productBTwo.doSomethingCommon();
    }
}
