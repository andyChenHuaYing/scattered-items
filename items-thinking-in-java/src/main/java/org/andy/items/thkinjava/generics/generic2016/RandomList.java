package org.andy.items.thkinjava.generics.generic2016;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Description : Obtain an element randomly.
 * Author: oscar
 * Create Data: 02/03/16
 */
public class RandomList<T> {
    private List<T> storage = new ArrayList<>();
    private Random random = new Random(47);

    public void add(T t) {
        storage.add(t);
    }

    public T select() {
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        String str = "a b c d e f g";
        for (String s : str.split(" ")) {
            randomList.add(s);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(randomList.select());
        }
    }
}
