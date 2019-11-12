package org.andy.items.thkinjava.string.Exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-28 18:45
 */
public class Ex7 {
    public boolean regularTest(String s) {
        Pattern pattern = Pattern.compile("^[A-Z].*\\.");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
