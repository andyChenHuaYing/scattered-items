package org.springframework.samples.utils;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-15 11:25
 */
public class ToString {
    public static String toString(Class ... classes) {
        StringBuffer stringBuffer = new StringBuffer();
        int total = 0;
        for (Class clazz : classes) {
            stringBuffer.append("--> " + clazz.getName() + "\r\n");
            total ++;
        }
        stringBuffer.append("total clazz number : " + total);
        return stringBuffer.toString();
    }
}
