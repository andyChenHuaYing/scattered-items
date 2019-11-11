package org.oscar;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-05-26
 */
public class MyRateLimiterTest {

    @Test
    public void acquire() {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        MyRateLimiter myRateLimiter = new MyRateLimiter(1);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                myRateLimiter.acquire();
                System.out.println(System.currentTimeMillis() - start);
            });
        }

        executor.shutdown();


    }
}