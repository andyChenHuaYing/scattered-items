package org.oscar.items.thkinjava.string.dto;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-20 20:54
 */
public class Coffee {
    private static int counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", " + id;
    }
}
