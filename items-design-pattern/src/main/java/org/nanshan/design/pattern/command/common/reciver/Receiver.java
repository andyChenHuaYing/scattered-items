package org.nanshan.design.pattern.command.common.reciver;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public abstract class Receiver {

    public void doSomethingCommon() {
        System.out.println(this.getClass().getSimpleName() + " do something common...");
    }

    public abstract void doSomethingDetail();
}
