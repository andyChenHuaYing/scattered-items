package org.alien.design.pattern.template.common;

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
        this.doSomethingDetail();
        this.doAndyThing();
    }
}
