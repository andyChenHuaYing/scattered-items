package org.oscar.items.thkinjava.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by andy on 5/24/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class RandomList<T> {

    private ArrayList<T> storage = new ArrayList<>();
    private Random random = new Random(47);

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        for (String s : "The quick brown fox jumped over the lazy brown dog".split(" ")) {
            randomList.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.print(randomList.select() + " ");
        }
    }

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(random.nextInt(storage.size()));
    }
}
