package org.springframework.samples.ioc.schema.injection.issue.circular;

import org.springframework.samples.utils.ShowReferencesUtil;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-16 11:46
 */
public class CircularDependencyAPrototype {
    private CircularDependencyBPrototype circularDependencyBPrototype;

    public CircularDependencyAPrototype() {
        System.out.println("Instantiate CircularDependencyAPrototype");
    }

    //    public CircularDependencyASingleton(CircularDependencyBPrototype circularDependencyBPrototype) {
//        System.out.println("Inject B to a");
//        this.circularDependencyBPrototype = circularDependencyBPrototype;
//    }


    public void setCircularDependencyBPrototype(CircularDependencyBPrototype circularDependencyBPrototype) {
        this.circularDependencyBPrototype = circularDependencyBPrototype;
    }

    @Override
    public String toString() {
        return ShowReferencesUtil.showClassFullName(this.getClass());
    }

    public void invokingB() {
        System.out.println(circularDependencyBPrototype.toString());
    }
}
