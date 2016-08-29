package org.alien.design.pattern.template.extantion;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/4
 */
public class AbstractClassImplB extends AbstractClass {
    @Override
    public void doSomethingDetail() {
        System.out.println("AbstractClassImplB.doSomethingDetail");
    }

    @Override
    public boolean ifDoSomethingDetailHook() {
        return super.ifDoSomethingDetailHook();
    }

    @Override
    public void doAndyThing() {
        System.out.println("AbstractClassImplB.doAndyThing");
    }
}
