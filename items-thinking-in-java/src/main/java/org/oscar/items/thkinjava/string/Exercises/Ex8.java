package org.oscar.items.thkinjava.string.Exercises;

import org.oscar.items.thkinjava.string.Splitting;
import org.oscar.items.thkinjava.string.utils.Print;

import java.util.Arrays;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-28 19:00
 */
public class Ex8 {
    public static void main(String[] args) {
        Print.ln(Arrays.toString(Splitting.knights.split("the|you")));
    }
}
