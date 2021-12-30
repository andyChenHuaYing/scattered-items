package org.nanshan.design.pattern.abstraction.factory.demo.product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public class BlackMalePerson extends MalePerson {
    @Override
    public void getColor() {
        System.out.println("BlackMalePerson.getColor");
    }
}
