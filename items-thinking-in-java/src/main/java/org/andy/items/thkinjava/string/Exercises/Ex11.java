package org.andy.items.thkinjava.string.Exercises;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-10-28 20:24
 */
public class Ex11 {
    public static void main(String[] args) {
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        String input = "Arline ate eight apples and one orange while Anita hadn’t any";

        System.out.println(input.replace(regex, "_"));
    }
}
