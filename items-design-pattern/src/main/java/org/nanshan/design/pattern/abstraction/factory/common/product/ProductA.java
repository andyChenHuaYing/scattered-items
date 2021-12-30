package org.nanshan.design.pattern.abstraction.factory.common.product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public abstract class ProductA {

    public void doSomethingCommon() {
        System.out.println(this.getClass().getSimpleName() + " do something common...");
    }

    public abstract void doSomethingDetail();
}
