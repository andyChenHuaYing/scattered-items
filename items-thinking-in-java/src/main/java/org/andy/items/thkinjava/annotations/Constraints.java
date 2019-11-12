package org.andy.items.thkinjava.annotations;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-11-26 19:16
 */
public @interface Constraints {
    boolean allowNull() default true;

    boolean primaryKey() default false;

    boolean foreignKey() default false;

    boolean unique() default false;
}
