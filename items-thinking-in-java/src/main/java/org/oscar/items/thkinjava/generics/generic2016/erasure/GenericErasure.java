package org.oscar.items.thkinjava.generics.generic2016.erasure;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: oscar
 * Create Data: 10/03/16
 */
public class GenericErasure {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        System.out.println(strings.getClass() == integers.getClass());
    }
}
