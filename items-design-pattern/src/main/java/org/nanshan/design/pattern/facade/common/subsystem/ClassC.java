package org.nanshan.design.pattern.facade.common.subsystem;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class ClassC {
    public void doSomethingCommon() {
        System.out.println(this.getClass().getSimpleName() + " do something common...");
    }
}
