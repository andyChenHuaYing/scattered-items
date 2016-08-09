package org.alien.design.pattern.facade.common.subsystem;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class ClassA {
    public void doSomethingCommon() {
        System.out.println(this.getClass().getSimpleName() + " do something common...");
    }
}
