package org.oscar.items.thkinjava.string.utils;

import org.oscar.items.thkinjava.string.dto.Americano;
import org.oscar.items.thkinjava.string.dto.Breve;
import org.oscar.items.thkinjava.string.dto.Cappuccino;
import org.oscar.items.thkinjava.string.dto.Coffee;
import org.oscar.items.thkinjava.string.dto.Latte;
import org.oscar.items.thkinjava.string.dto.Mocha;

import java.util.Iterator;
import java.util.Random;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-10-27 18:09
 */
public class CoffeeGenerator implements Generator, Iterable<Coffee> {
    private static Random random = new Random(47);
    private Class[] types = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    private int size;

    @SuppressWarnings("unused")
    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int sz) {
        this.size = sz;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    private class CoffeeIterator implements Iterator<Coffee> {
        int counter = 1;

        @Override
        public void remove() {
            throw new RuntimeException();
        }

        @Override
        public Coffee next() {
            counter++;
            return CoffeeGenerator.this.next();
        }

        @Override
        public boolean hasNext() {
            return counter <= size;
        }
    }
}
