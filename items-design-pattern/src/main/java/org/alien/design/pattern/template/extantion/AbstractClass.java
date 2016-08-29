package org.alien.design.pattern.template.extantion;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/4
 */
public abstract class AbstractClass {

    public abstract void doSomethingDetail();

    public abstract void doAndyThing();

    public final void templateMethod(){
        if (ifDoSomethingDetailHook()) {
            this.doSomethingDetail();
        }

        this.doAndyThing();
    }

    public boolean ifDoSomethingDetailHook(){
        return true;
    }
}
