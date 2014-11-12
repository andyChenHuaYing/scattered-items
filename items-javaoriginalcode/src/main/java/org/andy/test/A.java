package org.andy.test;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-04 18:20
 */
abstract class A {
    public String str = "normar";
    public static String strStatic = "Static Str";

    public A(){
        System.out.println("Construct of A");
    }

    public static void staticA(){
        System.out.println("A.staticA()");
    }

    public void methodA(){
        System.out.println("A.methodA()");
    }
}
