package org.nanshan.design.pattern.abstraction.factory.demo.product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public abstract class MalePerson {

    public void getSex() {
        System.out.println("Male...");
    }

    public abstract void getColor();
}
