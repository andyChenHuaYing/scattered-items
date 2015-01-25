package org.springframework.samples.ioc.schema.injection.circular;

import org.springframework.samples.utils.ShowReferencesUtil;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-16 11:46
 */
public class CircularDependencyASingleton {
    private CircularDependencyBSingleton circularDependencyBSingleton;

    public CircularDependencyASingleton() {
        System.out.println("Instantiate CircularDependencyASingleton");
    }

    //    public CircularDependencyASingleton(CircularDependencyBSingleton circularDependencyBSingleton) {
//        System.out.println("Inject B to a");
//        this.circularDependencyBSingleton = circularDependencyBSingleton;
//    }


    public void setCircularDependencyBSingleton(CircularDependencyBSingleton circularDependencyBSingleton) {
        this.circularDependencyBSingleton = circularDependencyBSingleton;
    }

    @Override
    public String toString() {
        return ShowReferencesUtil.showClassFullName(this.getClass());
    }

    public void invokingB(){
        System.out.println(circularDependencyBSingleton.toString());
    }
}
