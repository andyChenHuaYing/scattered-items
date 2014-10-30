package org.andy.items.thkinjava.string.Exercises;

import org.andy.items.thkinjava.string.Splitting;
import org.andy.items.thkinjava.string.utils.Print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-10-28 19:01
 */
public class Ex9 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a|e|u|v|o");
        Matcher matcher = pattern.matcher(Splitting.knights);
        Print.ln(matcher.replaceAll("_"));
    }
}
