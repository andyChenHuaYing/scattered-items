package org.springframework.samples.ioc;

import org.springframework.samples.utils.ToString;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-16 11:46
 */
public class CircularDependencyA {
    private CircularDependencyB circularDependencyB;

    public CircularDependencyA() {
        System.out.println("Instantiate A");
    }

    //    public CircularDependencyA(CircularDependencyB circularDependencyB) {
//        System.out.println("Inject B to a");
//        this.circularDependencyB = circularDependencyB;
//    }


    public void setCircularDependencyB(CircularDependencyB circularDependencyB) {
        this.circularDependencyB = circularDependencyB;
    }

    @Override
    public String toString() {
        return ToString.toString(this.getClass());
    }

    public void invokingB(){
        System.out.println(circularDependencyB.toString());
    }
}
