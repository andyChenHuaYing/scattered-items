package org.andy.items.thkinjava.string;

import org.andy.items.thkinjava.string.utils.Print;

import java.util.Arrays;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-28 18:27
 */
public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void split(String regex) {
        Print.ln(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W");
        split("n\\W");
    }
}
