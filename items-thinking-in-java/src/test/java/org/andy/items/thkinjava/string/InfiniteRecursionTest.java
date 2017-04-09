package org.andy.items.thkinjava.string;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class InfiniteRecursionTest {
    private InfiniteRecursion infiniteRecursion = new InfiniteRecursion();

    @Before
    public void setUp() {
        System.out.println("Test start...");
    }

    @Test
    public void testPrintSelfAddress() throws Exception {
        Assert.assertEquals(10, infiniteRecursion.printSelfAddress(10));
    }
}