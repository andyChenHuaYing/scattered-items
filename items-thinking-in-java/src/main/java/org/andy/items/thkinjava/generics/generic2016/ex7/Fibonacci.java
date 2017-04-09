package org.andy.items.thkinjava.generics.generic2016.ex7;

/**
 * Author: oscar
 * Create Data: 02/03/16
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci.next());
        }
    }

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
