package org.springframework.samples.utils;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-24 11:05
 */
public class PrintUtil {

    private static final String LINEBREAK = "\r\n";

    public static String formatTestResult(Object... objects) {


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#######################################Test Result###############################");
        for (int i = 0; i < objects.length; i++) {
            stringBuilder.append(LINEBREAK);
            stringBuilder.append("Result ").append(i).append(" : ");
            stringBuilder.append(objects[i]);
        }
        stringBuilder.append(LINEBREAK);
        stringBuilder.append("#################################################################################");
        stringBuilder.append(LINEBREAK);
        return stringBuilder.toString();
    }
}
