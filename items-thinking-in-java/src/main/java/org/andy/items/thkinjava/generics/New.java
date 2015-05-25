package org.andy.items.thkinjava.generics;

import java.util.*;

/**
 * Created by andy on 5/24/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
public class New {

    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }

    public static <T> List<T> list() {
        return new ArrayList<>();
    }

    public static <T> Set<T> set() {
        return new HashSet<>();
    }

    public static <T> LinkedList<T> linkedList() {
        return new LinkedList<>();
    }

    public static <T> Queue<T> queue() {
        return linkedList();
    }

    public static void main(String[] args) {
        Map<String, List<String>> map = New.map();
    }
}
