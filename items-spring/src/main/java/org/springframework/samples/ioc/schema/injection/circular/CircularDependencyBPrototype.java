package org.springframework.samples.ioc.schema.injection.circular;

import org.springframework.samples.utils.ShowReferencesUtil;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-16 11:46
 */
public class CircularDependencyBPrototype {
    private CircularDependencyAPrototype circularDependencyAPrototype;

    public CircularDependencyBPrototype() {
        System.out.println("Instantiate CircularDependencyBPrototype");
    }

    //    public CircularDependencyBSingleton(CircularDependencyAPrototype circularDependencyAPrototype) {
//        System.out.printf("Inject A to B");
//        this.circularDependencyAPrototype = circularDependencyAPrototype;
//    }


    public void setCircularDependencyAPrototype(CircularDependencyAPrototype circularDependencyAPrototype) {
        this.circularDependencyAPrototype = circularDependencyAPrototype;
    }

    @Override
    public String toString() {
        return ShowReferencesUtil.showClassFullName(this.getClass());
    }

    public void invokingA() {
        System.out.println("invoking A : " + circularDependencyAPrototype.toString());
    }
}
