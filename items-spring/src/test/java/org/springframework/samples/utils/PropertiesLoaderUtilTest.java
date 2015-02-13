package org.springframework.samples.utils;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PropertiesLoaderUtilTest {

    private PropertiesLoaderUtil propertiesLoaderUtil;

    @Before
    public void setUp() throws Exception {
        propertiesLoaderUtil = new PropertiesLoaderUtil("properties/mysql-jdbc.properties");
    }

    @After
    public void tearDown() throws Exception {
        propertiesLoaderUtil = null;
    }

    @Test
    public void testGetValue() throws Exception {
        Assert.assertEquals("root", propertiesLoaderUtil.getProperty("jdbc.username"));
    }

    @Test
    public void testGetProperty() throws Exception {

    }

    @Test
    public void testGetProperty1() throws Exception {

    }

    @Test
    public void testGetInteger() throws Exception {

    }

    @Test
    public void testGetInteger1() throws Exception {

    }

    @Test
    public void testGetDouble() throws Exception {

    }

    @Test
    public void testGetDouble1() throws Exception {

    }

    @Test
    public void testGetBoolean() throws Exception {

    }

    @Test
    public void testGetBoolean1() throws Exception {

    }
}