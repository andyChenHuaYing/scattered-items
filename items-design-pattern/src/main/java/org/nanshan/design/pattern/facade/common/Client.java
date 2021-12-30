package org.nanshan.design.pattern.facade.common;

import org.nanshan.design.pattern.facade.common.facade.Facade;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.classADoSomethingCommon();
        facade.classBDoSomethingCommon();
        facade.classCDoSomethingCommon();
    }
}
