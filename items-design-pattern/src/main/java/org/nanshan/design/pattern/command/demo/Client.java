package org.nanshan.design.pattern.command.demo;

import org.nanshan.design.pattern.command.demo.command.Command;
import org.nanshan.design.pattern.command.demo.command.DeleteCommand;
import org.nanshan.design.pattern.command.demo.invoker.Invoker;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class Client {

    public static void main(String[] args) {
        Command command = new DeleteCommand();
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
