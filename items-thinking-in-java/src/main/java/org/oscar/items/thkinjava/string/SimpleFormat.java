package org.oscar.items.thkinjava.string;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-27 21:25
 */
public class SimpleFormat {
    public static void main(String[] args) {
        String x = "x";
        double y = 5.234234234;
        System.out.println("Row 1: [" + x + " " + y + "]");

        System.out.format("Row 1: [%s %f]\n", x, y);
        System.out.printf("Row 1: [%d %f]\n", x, y);
    }
}
