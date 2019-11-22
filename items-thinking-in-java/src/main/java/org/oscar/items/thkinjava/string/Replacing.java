package org.oscar.items.thkinjava.string;

import org.oscar.items.thkinjava.string.utils.Print;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-28 18:39
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        Print.ln(s.replaceFirst("f\\w+", "located"));
        Print.ln(s.replaceFirst("shrubbery|tree|herring", "banana"));
    }
}
