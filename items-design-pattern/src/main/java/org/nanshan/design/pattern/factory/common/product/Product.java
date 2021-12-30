package org.nanshan.design.pattern.factory.common.product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public abstract class Product {

    public abstract void doSomethingDetail();

    public void doSomethingCommon() {
        System.out.println("Product.doSomethingCommon");
    }
}
