package org.oscar.items.thkinjava.string;

import java.util.ArrayList;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-27 19:02
 */
public class InfiniteRecursion {

    public InfiniteRecursion() {
    }


    public int printSelfAddress(int size) {
        ArrayList<InfiniteRecursion> infiniteRecursions = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < size; i++) {
            infiniteRecursions.add(new InfiniteRecursion());
        }
        System.out.println(infiniteRecursions);
        return size;
    }

    @Override
    public String toString() {
        return " InfiniteRecursion address : " + super.toString() + "\n";
    }
}
