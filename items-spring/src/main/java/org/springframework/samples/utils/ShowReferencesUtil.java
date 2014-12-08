package org.springframework.samples.utils;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-19 19:59
 */
public class ShowReferencesUtil {
    public static void showReferences(Object... objects) {
        for (Object object : objects) {
            if (object instanceof Set) {
                showSetReferences((Set<Object>) object);
            }else if (object instanceof Array) {
                showArrayReference((Object[]) object);
            }else if (object instanceof Map) {
                showMapReferences((Map<String, Object>) object);
            } else {
                System.out.println(refactorToString(object));
            }
        }
    }
    
    private static void showArrayReference(Object[] objects) {
        for (Object obj : objects) {
            System.out.println(refactorToString(obj));
        }
    }

    private static void showSetReferences(Set<Object> objectSet) {
        for (Object obj : objectSet) {
            System.out.println(refactorToString(obj));
        }
    }

    private static void showMapReferences(Map<String, Object> objectMap) {
        Set<String> keys = objectMap.keySet();
        for (String key : keys) {
            System.out.println("key : " + key + ", object : " + refactorToString(objectMap.get(key)));
        }
    }

    private static String refactorToString(Object obj) {
        return obj.getClass().getSimpleName() + " " + obj.hashCode();
    }
}
