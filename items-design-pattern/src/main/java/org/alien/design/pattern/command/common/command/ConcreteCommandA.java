package org.alien.design.pattern.command.common.command;

import org.alien.design.pattern.command.common.reciver.Receiver;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class ConcreteCommandA extends Command {

    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomethingDetail();
    }
}
