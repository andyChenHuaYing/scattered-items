package org.andy.items.thkinjava.string;

import org.andy.items.thkinjava.string.utils.Print;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-10-28 21:26
 */
public class MatcherSplitDemo {
    private static String input =
            "This!!unusual use!!of exclamation!!points";

    public static void main(String[] args) {
        matcherSplit();
        stringSplit();
    }


    private static void stringSplit() {
        Print.ln(Arrays.toString(input.split("!!", 1)));
    }

    private static void matcherSplit() {

        Print.ln(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // Only do the first three:
        Print.ln(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
    }
    /**
     * Note-1
     *      split(String input, int limit) the first limit-1 matches will be done.
     */
}
