package org.oscar.items.thkinjava.string;

import org.oscar.items.thkinjava.string.utils.Print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-28 20:39
 */
public class Finding {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");

        /**
         * Note-1
         */
        while (matcher.find()) {
            Print.p(matcher.group() + " ");
        }
        Print.ln("\r\n");

        /**
         * Note-2
         */
        int i = 0;
        while (matcher.find(i)) {
            Print.p(matcher.group() + " ");
            i++;
        }
    }
    /**
     * Note-1:
     *      find() is like an iterator, moving forward through the input string by regular.
     */

    /**
     * Note-2:
     *      find(int i) the integer argument tell it the character position for the beginning
     *      of the search--this version resets the search position to the value of the argument
     *      as you can see from the output.
     */
}
