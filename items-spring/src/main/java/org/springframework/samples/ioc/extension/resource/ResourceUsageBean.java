package org.springframework.samples.ioc.extension.resource;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/9.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class ResourceUsageBean {

    private MessageSource messageSource;

    public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
        return messageSource.getMessage(code, args, locale);
    }

    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return messageSource.getMessage(code, args, defaultMessage, locale);
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
