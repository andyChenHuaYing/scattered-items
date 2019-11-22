package org.oscar.items.thkinjava.generics.generic2016.ex7;

import java.util.Iterator;

/**
 * Description: Adapter design pattern.
 * Author: oscar
 * Create Data: 02/03/16
 */
public class IterableFibonacci implements Iterable<Integer> {
    private int n;
    private Fibonacci fibonacci;

    public IterableFibonacci(int n, Fibonacci fibonacci) {
        this.n = n;
        this.fibonacci = fibonacci;
    }

    public static void main(String[] args) {
        IterableFibonacci iterableFibonacci = new IterableFibonacci(10, new Fibonacci());
        for (Integer integer : iterableFibonacci) {
            System.out.println(integer);

        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fibonacci.next();
            }
        };
    }
}
