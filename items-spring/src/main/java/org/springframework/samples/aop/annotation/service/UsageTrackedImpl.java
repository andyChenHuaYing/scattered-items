package org.springframework.samples.aop.annotation.service;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-19 22:01
 */
public class UsageTrackedImpl implements UsageTracked {
    private static int count = 0;

    @Override
    public int incrementUseCount() {
        return ++count;
    }
}
