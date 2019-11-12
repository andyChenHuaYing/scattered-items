package org.oscar.reflection.load.statik;

import org.junit.Before;
import org.junit.Test;

public class ColorUtilTest {
    private ColorUtil colorUtil;

    @Before
    public void setUp() throws Exception {
        colorUtil = new ColorUtil("org.alien.reflection.load.demo.Yellow");
    }

    @Test
    public void testShowRGB() throws Exception {
        colorUtil.showRGB();
    }
}