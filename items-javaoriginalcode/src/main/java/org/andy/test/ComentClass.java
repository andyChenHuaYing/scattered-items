package org.andy.test;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-04 18:22
 */
public class ComentClass extends A {
    public ComentClass() {

        super();
        System.out.println("Coment class construct");
    }

    public static void comentClass(){
        System.out.println("Coment static class method");
    }

    public void normalMehtod(){
        System.out.println("Coment class normal methods");
    }

    public static void main(String[] args) {
//        ComentClass comentClass = new ComentClass();
//        A.staticA();
        ComentClass.staticA();
    }
}
