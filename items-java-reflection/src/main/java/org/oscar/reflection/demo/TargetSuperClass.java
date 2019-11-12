package org.oscar.reflection.demo;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-22 21:43
 */
@SuppressWarnings("unused")
public class TargetSuperClass {
    public void whoAmI() {
        System.out.println(this.getClass().getName());
    }
}
