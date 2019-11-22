package org.oscar.items.thkinjava.custom;

import java.lang.reflect.Method;

/**
 * Author: oscar
 * Create Data: 23/03/16
 */
public class ReflectDemo {

    public static void main(String[] args) {
        Class clazz = Sub.class;

        for (Method method : clazz.getMethods()) {
            System.out.println(method.getName());
        }
        System.out.println("================");


        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }
}

class Super {
    void superMethod() {
    }

    public void superPublicMethod() {
    }
}

class Sub extends Super {
    private void subPrivateMethd() {
    }

    protected void subProtectedMethod() {
    }

    void subMethod() {
    }

    public void subPublicMethod() {
    }


}
