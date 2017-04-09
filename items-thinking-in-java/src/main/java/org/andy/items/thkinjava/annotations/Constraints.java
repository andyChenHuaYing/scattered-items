package org.andy.items.thkinjava.annotations;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-26 19:16
 */
public @interface Constraints {
    public boolean allowNull() default true;

    public boolean primaryKey() default false;

    public boolean foreignKey() default false;

    public boolean unique() default false;
}
