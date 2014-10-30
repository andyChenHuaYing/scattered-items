package org.andy.items.thkinjava.string.utils;

import org.andy.items.thkinjava.string.dto.*;

import java.util.Iterator;
import java.util.Random;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-10-27 18:09
 */
public class CoffeeGenerator implements Generator ,Iterable<Coffee>{
    private Class[] types = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    private int size;
    private static Random random = new Random(47);

    public CoffeeGenerator(){}
    public CoffeeGenerator(int sz){
        this.size = sz;
    }

    private class CoffeeIterator implements Iterator<Coffee>{
        int counter = 1;

        @Override
        public void remove() {
            throw new RuntimeException();
        }

        @Override
        public Coffee next() {
            counter ++;
            return CoffeeGenerator.this.next();
        }

        @Override
        public boolean hasNext() {
            return counter <= size;
        }
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
}
