package org.oscar;

import java.util.concurrent.TimeUnit;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-05-26
 */
public class MyRateLimiter {

    private long next = System.nanoTime();

    private long interval;

    public MyRateLimiter(long interval) {
        this.interval = interval * 1000_000_000;
    }

    public void acquire() {
        long now = System.nanoTime();

        long at = reserve(now);

        long waitTime = Math.max(at - now, 0);

        if (waitTime > 0) {
            try {
                TimeUnit.NANOSECONDS.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized long reserve(long now) {
        if (now > next) {
            next = now;
        }

        long at = next;

        next += interval;

        return Math.max(at, 0);
    }
}
