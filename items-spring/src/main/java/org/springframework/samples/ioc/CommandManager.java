package org.springframework.samples.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-17 21:23
 */
public class CommandManager implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public Object process(Map<String, Boolean> commandState) {
        Command command = createCommand();
        command.setState(commandState);
        return command.execute();
    }

    protected Command createCommand() {
        return this.applicationContext.getBean("command", Command.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
