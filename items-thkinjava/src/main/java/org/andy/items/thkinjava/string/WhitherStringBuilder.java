package org.andy.items.thkinjava.string;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-10-20 19:25
 */
public class WhitherStringBuilder {
    public String implicit(String[] fields) {
        String str = "";
        for (int i = 0; i <fields.length; i++) {
            str += fields[i];
        }
        return str.toString();
    }

    public String explicit(String[] fields) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            stringBuilder.append(fields[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] ia = new String[10];
        WhitherStringBuilder ws = new WhitherStringBuilder();
        System.out.println(ws.implicit(ia));
        System.out.println(ws.explicit(ia));
    }
}
