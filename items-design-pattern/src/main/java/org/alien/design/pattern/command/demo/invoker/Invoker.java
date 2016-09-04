package org.alien.design.pattern.command.demo.invoker;

import org.alien.design.pattern.command.demo.command.Command;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class Invoker {
    private Command command;

    public void action(){
        this.command.execute();
        System.out.println("Invoker.action");
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
