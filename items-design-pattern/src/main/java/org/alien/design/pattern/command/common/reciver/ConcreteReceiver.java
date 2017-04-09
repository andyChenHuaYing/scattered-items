package org.alien.design.pattern.command.common.reciver;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class ConcreteReceiver extends Receiver {
    @Override
    public void doSomethingDetail() {
        System.out.println("ConcreteReceiver.doSomethingDetail");
    }
}
