package org.springframework.samples.annotations.lookupInject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-24 19:49
 */
@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public AsyncCommand asyncCommand() {
        AsyncCommand command = new AsyncCommand();
        return command;
    }

    @Bean
    public CommandManager commandManager() {
        return new CommandManager() {
            @Override
            protected Command createCommand() {
                return asyncCommand();
            }
        };
    }
}
