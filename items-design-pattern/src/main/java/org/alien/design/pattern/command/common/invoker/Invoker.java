package org.alien.design.pattern.command.common.invoker;

import org.alien.design.pattern.command.common.command.Command;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
