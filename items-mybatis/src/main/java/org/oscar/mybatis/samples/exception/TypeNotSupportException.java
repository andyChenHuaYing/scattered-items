package org.alien.mybatis.samples.exception;

/**
 * Created by andy on 5/25/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
public class TypeNotSupportException extends Exception {

    public TypeNotSupportException() {
    }

    public TypeNotSupportException(String message) {
        super(message);
    }
}
