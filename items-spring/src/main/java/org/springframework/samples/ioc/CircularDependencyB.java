package org.springframework.samples.ioc;

import org.springframework.samples.utils.ToString;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-16 11:46
 */
public class CircularDependencyB {
    private CircularDependencyA circularDependencyA;

    public CircularDependencyB() {
        System.out.println("Instantiate B");
    }

    //    public CircularDependencyB(CircularDependencyA circularDependencyA) {
//        System.out.printf("Inject A to B");
//        this.circularDependencyA = circularDependencyA;
//    }


    public void setCircularDependencyA(CircularDependencyA circularDependencyA) {
        this.circularDependencyA = circularDependencyA;
    }

    @Override
    public String toString() {
        return ToString.toString(this.getClass());
    }

    public void invokingA(){
        System.out.println("invoking A : " + circularDependencyA.toString());
    }
}
