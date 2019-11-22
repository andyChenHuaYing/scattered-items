package org.oscar.items.thkinjava.string;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImmutableTest {

    private static Immutable immutable = new Immutable();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testUpcase() throws Exception {
        Assert.assertEquals("ANDY", immutable.upcase("andy"));
    }
}