package org.andy.items.thkinjava.typeinformation;

import org.andy.items.thkinjava.string.utils.Print;

import java.util.Arrays;
import java.util.List;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-29 20:25
 */
public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

abstract class Shape {
    void draw() {
        Print.ln(this + ".draw();");
    }

    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}
