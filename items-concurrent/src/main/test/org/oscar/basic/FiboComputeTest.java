package org.oscar.basic;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * TODO 使用尾递归来计算 + ForkJoinPool overflow 解决？
 *
 * @author huaying
 * @version 0.0.1
 * @since 2019-04-27
 */
public class FiboComputeTest {

    private int n = Integer.MAX_VALUE;

    @Test
    public void fiboCompute() {
        long start = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        Integer result = forkJoinPool.invoke(new Fibo(n));
        System.out.println(result);
        System.out.println("usage time: " + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void recursive() {
        long start = System.currentTimeMillis();
        long recursive = recursive(n);
        System.out.println(recursive);
        System.out.println("usage time: " + (System.currentTimeMillis() - start) + "ms");
    }

    private long recursive(int n) {
        if (n <= 2) {
            return 1;
        }

        return recursive(n - 1) + recursive(n - 2);

    }
}

class Fibo extends RecursiveTask<Integer> {

    private int n;

    public Fibo(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 2) {
            return 1;
        }

        Fibo f1 = new Fibo(n - 1);
        f1.fork();

        Fibo f2 = new Fibo(n - 2);

        return f2.compute() + f1.join();

    }
}