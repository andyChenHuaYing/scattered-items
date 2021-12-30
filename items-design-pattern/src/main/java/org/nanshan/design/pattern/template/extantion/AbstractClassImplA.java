package org.nanshan.design.pattern.template.extantion;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/4
 */
public class AbstractClassImplA extends AbstractClass {
    @Override
    public void doSomethingDetail() {
        System.out.println("AbstractClassImplA.doSomethingDetail");
    }

    @Override
    public boolean ifDoSomethingDetailHook() {
        return false;
    }

    @Override
    public void doAndyThing() {
        System.out.println("AbstractClassImplA.doAndyThing");
    }
}
