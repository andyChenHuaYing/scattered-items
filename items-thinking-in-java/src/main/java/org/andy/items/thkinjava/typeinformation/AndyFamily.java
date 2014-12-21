package org.andy.items.thkinjava.typeinformation;

import org.andy.items.thkinjava.string.utils.Print;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-10-29 21:06
 */
public class AndyFamily {

    public static void main(String[] args) {
        Print.ln("In the family");
        new Andy();
        Print.ln("After Andy...");
        new Star();
        Print.ln("After Star...");
        try {
            //Note-1
            Class.forName("org.andy.items.thkinjava.typeinformation.Year");
        } catch (ClassNotFoundException e) {
            Print.ln("Still have not child");
        }
        Print.ln("After Class.forName(\"Year\")");
    }
    /**
     * Note-1
     *      Class.forName(String fullClassName), the argument must be the package name + class name;
     */
}

class Andy {
    static{
        Print.ln("Andy : Father");
    }
}

class Star {
    static{
        Print.ln("Star : Mather");
    }
}

@SuppressWarnings("unused")
class Year {
    static{
        Print.ln("Year : child");
    }
}