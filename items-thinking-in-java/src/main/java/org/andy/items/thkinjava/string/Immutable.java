package org.andy.items.thkinjava.string;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-20 18:48
 */
public class Immutable {
    public static String upcase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String original_str = "andy";
        System.out.println(original_str);
        String upcased_str = Immutable.upcase(original_str);
        System.out.println(upcased_str);
        System.out.println(original_str);
    }
}
