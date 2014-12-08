package org.springframework.samples.annotations.internationalization;

import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-25 19:39
 */
public class I18NExample {
    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void execute() {
        String message = messageSource.getMessage("argument.required", new Object[]{"userDao"}, "Required", Locale.UK);
        System.out.println(message);
    }
}
