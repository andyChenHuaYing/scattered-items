package org.andy.items.thkinjava.string;

import org.andy.items.thkinjava.string.dto.Coffee;
import org.andy.items.thkinjava.string.utils.CoffeeGenerator;

import java.util.ArrayList;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-27 18:55
 */
public class ArrayListDisplay {
    public static int displayArrayList() {
        int counter = 0;
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for (Coffee c : new CoffeeGenerator(10)) {
            coffees.add(c);
            counter++;
        }
        System.out.println(coffees);
        return counter;
    }
}
