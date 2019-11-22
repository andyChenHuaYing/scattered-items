package org.oscar.items.thkinjava.string;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-28 19:33
 */
public class Rudolph {
    public static void main(String[] args) {
        for (String pattern : new String[]{"Rudolph", "[rR]udolph", "[rR][aeiou].*", "R.*", "[rR][a-z]+"}) {
            System.out.println("Rudolph".matches(pattern));
        }
    }
}
