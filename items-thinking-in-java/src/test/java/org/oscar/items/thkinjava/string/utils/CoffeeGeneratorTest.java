package org.oscar.items.thkinjava.string.utils;

import junit.framework.Assert;
import org.oscar.items.thkinjava.string.dto.Coffee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class CoffeeGeneratorTest {

    private CoffeeGenerator coffees = new CoffeeGenerator(10);

    @Before
    public void setUp() throws Exception {
        System.out.println("Test start......");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test end......");
    }

    @Test
    public void testIterator() throws Exception {
        Iterator<Coffee> it = coffees.iterator();
        ArrayList<Coffee> coffees1 = new ArrayList<Coffee>();
        while (it.hasNext()) {
            coffees1.add(it.next());
        }
        Assert.assertEquals(10, coffees1.size());
    }
}