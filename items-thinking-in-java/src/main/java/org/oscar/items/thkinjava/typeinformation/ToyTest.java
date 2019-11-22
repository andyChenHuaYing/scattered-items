package org.oscar.items.thkinjava.typeinformation;

import org.oscar.items.thkinjava.string.utils.Print;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-29 21:22
 */
interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    @SuppressWarnings("unused")
    Toy() {
    }

    Toy(int i) {
    }
}

@SuppressWarnings("unused")
class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        Print.ln("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        Print.ln("Simple name: " + cc.getSimpleName());
        Print.ln("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("org.oscar.items.thkinjava.typeinformation.FancyToy");
        } catch (ClassNotFoundException e) {
            Print.ln("Can’t find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor:
            obj = up.newInstance();
        } catch (InstantiationException e) {
            Print.ln("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            Print.ln("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
