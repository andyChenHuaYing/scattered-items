package org.springframework.samples.ioc.schema.injection.issue.circular;

import org.springframework.samples.utils.ShowReferencesUtil;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-16 11:46
 */
public class CircularDependencyBSingleton {
    private CircularDependencyASingleton circularDependencyASingleton;

    public CircularDependencyBSingleton() {
        System.out.println("Instantiate CircularDependencyBSingleton");
    }

    //    public CircularDependencyBSingleton(CircularDependencyASingleton circularDependencyASingleton) {
//        System.out.printf("Inject A to B");
//        this.circularDependencyASingleton = circularDependencyASingleton;
//    }


    public void setCircularDependencyASingleton(CircularDependencyASingleton circularDependencyASingleton) {
        this.circularDependencyASingleton = circularDependencyASingleton;
    }

    @Override
    public String toString() {
        return ShowReferencesUtil.showClassFullName(this.getClass());
    }

    public void invokingA(){
        System.out.println("invoking A : " + circularDependencyASingleton.toString());
    }
}
