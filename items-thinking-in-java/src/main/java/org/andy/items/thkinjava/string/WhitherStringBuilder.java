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
        for (String field : fields) {
            str += field;
        }
        return str;
    }

    public String explicit(String[] fields) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String field : fields) {
            stringBuilder.append(field);
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
