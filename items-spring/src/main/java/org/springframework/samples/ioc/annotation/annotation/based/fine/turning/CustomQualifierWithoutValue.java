package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Happy day, happy life.
 * <p/>
 * Without any value, this may be useful when the annotation serves a more generic purpose and can be applied across
 * several different types of dependencies.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-02 20:54
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomQualifierWithoutValue {

}
