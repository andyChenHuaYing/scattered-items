package org.alien.design.pattern.command.common;

import org.alien.design.pattern.command.common.command.Command;
import org.alien.design.pattern.command.common.command.ConcreteCommandA;
import org.alien.design.pattern.command.common.invoker.Invoker;
import org.alien.design.pattern.command.common.reciver.ConcreteReceiver;
import org.alien.design.pattern.command.common.reciver.Receiver;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new ConcreteReceiver();
        Command command = new ConcreteCommandA(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}