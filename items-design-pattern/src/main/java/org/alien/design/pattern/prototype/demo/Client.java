package org.alien.design.pattern.prototype.demo;

import org.alien.design.pattern.prototype.demo.deep.copy.DeepCopyPrototype;
import org.alien.design.pattern.prototype.demo.shadow.copy.ShadowPrototype;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {

        //shadow copy
        ShadowPrototype prototype = new ShadowPrototype();
        ShadowPrototype clonePrototype = prototype.clone();
        prototype.getList().add("raw prototype list element");
        clonePrototype.getList().add("cloned prototype list element");
        System.out.println(prototype.getList().size());
        System.out.println(clonePrototype.getList().size());

        System.out.println("-----------------------------------------------------------");

        //deep copy
        DeepCopyPrototype deepCopyPrototype = new DeepCopyPrototype();
        DeepCopyPrototype cloneDeepCopyPrototype = deepCopyPrototype.clone();
        deepCopyPrototype.getList().add("raw deep copy list element");
        cloneDeepCopyPrototype.getList().add("cloned prototype list element");
        System.out.println(deepCopyPrototype.getList().size());
        System.out.println(cloneDeepCopyPrototype.getList().size());

    }

}
