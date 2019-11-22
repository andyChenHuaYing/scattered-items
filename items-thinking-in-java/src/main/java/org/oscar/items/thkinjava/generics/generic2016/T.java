package org.oscar.items.thkinjava.generics.generic2016;

import java.util.List;

/**
 * Author: oscar
 * Create Data: 03/03/16
 */
public class T {
    public static void main(String[] args) {

    }


    @SuppressWarnings("raw")
    public void t(List<?> list) {
        int i = 0;
        while (i < list.size()) {

            System.out.println(list.get(i));
            i++;
        }
    }
}
