package org.andy.items.thkinjava.generics;

import org.andy.items.thkinjava.entity.EntityOne;

import java.util.List;
import java.util.Map;

/**
 * Created by andy on 5/24/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
public class ExplicitTypeSpecification {
    static void f(Map<EntityOne, List<String>> string) {
    }

    public static void main(String[] args) {
        f(New.<EntityOne, List<String>>map());
    }
}
