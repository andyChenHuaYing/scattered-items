package org.andy.items.thkinjava.generics.generic2016.avoid.generic.restrict;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Author: oscar
 * Create Data: 10/03/16
 */
public class HowToAvoidGenericRestrict {

    /**
     * 简单演示一下如何使用反射向一个拥有泛型的List中添加泛型指定类型之外的元素
     *
     * @param args ignore
     */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //声明一个只能存放String类型的list
        List<String> list = new ArrayList<>();
        //向上面一个list中加入一个Integer类型的元素
        //list.add(1); //compile error
        System.out.println("Before add, the size of list is : " + list.size());
        Class<?> clazz = list.getClass();
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(list, 1);
        System.out.println("After add, the size of list is : " + list.size());

        System.out.println(list.get(0));
    }
}

class C<T extends Collection<? extends Number>> {
}