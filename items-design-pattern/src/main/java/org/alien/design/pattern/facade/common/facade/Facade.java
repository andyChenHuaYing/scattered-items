package org.alien.design.pattern.facade.common.facade;

import org.alien.design.pattern.facade.common.subsystem.ClassA;
import org.alien.design.pattern.facade.common.subsystem.ClassB;
import org.alien.design.pattern.facade.common.subsystem.ClassC;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();


    public void classADoSomethingCommon(){
        classA.doSomethingCommon();
    }

    public void classBDoSomethingCommon(){
        classB.doSomethingCommon();
    }

    public void classCDoSomethingCommon(){
        classC.doSomethingCommon();
    }
}
