package org.andy.items.thkinjava.generics.generic2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: oscar
 * Create Data: 02/03/16
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();

        Collections.addAll(result, args);
        return result;
    }

    public static void main(String[] args) {
        List<String> list = makeList("abcdefghijklmn".split(""));
        System.out.println(list);
    }

}
