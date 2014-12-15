package org.springframework.samples.exceptions;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-15 21:00
 */
public class ProceedFailException extends RuntimeException {
    public ProceedFailException(String message) {
        super(message);
    }
}
