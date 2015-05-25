package org.andy.items.thkinjava.generics;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by andy on 5/24/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class Sets {

    public static <T> Set<T> unionAll(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static <T> Set<T> difference(Set<T> superSet, Set<T> subSet) {
        Set<T> result = new HashSet<>(subSet);
        result.removeAll(subSet);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>();
        result.retainAll(b);
        return result;
    }
}
