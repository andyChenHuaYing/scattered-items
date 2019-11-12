package org.andy.items.thkinjava.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-28 21:21
 */
public class ReFlags {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has regex\nJava has regex\n" +
                        "JAVA has pretty good regular expressions\n" +
                        "Regular expressions are in Java");
        while (m.find())
            System.out.println(m.group());
    }
}
