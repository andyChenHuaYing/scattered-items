package org.andy.items.thkinjava.string.Exercises;

import org.andy.items.thkinjava.string.utils.Print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-28 20:09
 */
public class Ex10 {
    private static String input = "Java now has regular expressions";

    public static boolean isMatcher(String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
       /* String[] regexs = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "\\s?,",
            "\\s*", "\\s+", "\\s{4}", "\\S{1}.", "\\s{0,3}"
        };
        for (String regex : regexs) {
            Print.ln(isMatcher(regex));
        }*/

        String regex = "";
        Print.ln(isMatcher(regex));
    }
}
