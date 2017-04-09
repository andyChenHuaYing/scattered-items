package org.andy.items.thkinjava.string;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-10-27 21:31
 */
public class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.formatter = f;
    }

    public static void main(String[] args) {
        PrintStream printStream = System.err;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.err));
        Turtle terry = new Turtle("Terry", new Formatter(printStream));
        tommy.move(0, 0);
        terry.move(2, 4);
        tommy.move(3, 7);
        terry.move(6, 4);
        tommy.move(6, 9);
    }

    public void move(int x, int y) {
        formatter.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }
}
