package org.oscar.reflection.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Demonstrate java reflect could bypass the Collection Generic.
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-22 20:46
 */
@SuppressWarnings("unchecked")
public class CollectionGenericEssence {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> arrayList = new ArrayList<String>();
        Class clazz = arrayList.getClass();
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(arrayList, 20);
        System.out.println(arrayList.size());
    }

    /**
     * Use java reflect to bypass the Collection Generic.
     *
     * @param arrayList ArrayList of String.
     * @param value     An object which will be added in ArrayList of String.
     */
    public ArrayList<String> addElementsByMethodReflect(ArrayList<String> arrayList, Object value) {
        /*
         * Illegal value type:
         * arrayList.add(value);
         */

        Class arrayListClass = arrayList.getClass();
        try {
            Method method = arrayListClass.getMethod("add", Object.class);
            method.invoke(arrayList, value);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    @Override
    public String toString() {
        return "CollectionGenericEssence{}";
    }
}
