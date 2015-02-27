package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import java.lang.annotation.*;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-02 22:20
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomAutowireConfigurerQualifier {
    String value() default "";
}
