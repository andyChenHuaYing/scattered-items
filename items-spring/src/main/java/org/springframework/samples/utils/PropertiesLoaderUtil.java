package org.springframework.samples.utils;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Properties load util, Last property value will be apply if there are multiple properties have the same name, but
 * System properties have the highest priority.
 * Created by andychen on 2015/2/13.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class PropertiesLoaderUtil {

    private static Logger logger = LoggerFactory.getLogger(PropertiesLoaderUtil.class);

    private static ResourceLoader resourceLoader = new DefaultResourceLoader();

    private final Properties properties;

    public PropertiesLoaderUtil(String... resourcesPath) {
        this.properties = loadProperties(resourcesPath);
    }

    /**
     * Get the property value.
     */
    public String getValue(String key) {
        String value = System.getProperty(key);
        return value == null ? properties.getProperty(key) : value;
    }

    /**
     * Get the property value, if null throw NoSuchElementException.
     */
    public String getProperty(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return value;
    }

    /**
     * Get the property value, if null return the default value..
     */
    public String getProperty(String key, String defaultValue) {
        String value = getValue(key);
        return value != null ? value : defaultValue;
    }

    /**
     * Get the int property value, if null or the return type is null or not int type than throw
     * NoSuchElementException.
     */
    public Integer getInteger(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Integer.valueOf(value);
    }

    /**
     * Get the int property value, if null or the return type is null than return null, if the result is not int
     * type than throw Exception.
     */
    public Integer getInteger(String key, Integer defaultValue) {
        String value = getValue(key);
        return value != null ? Integer.valueOf(value) : defaultValue;
    }

    /**
     * Get the double property value, if null or the return type is null or not double type than throw
     * NoSuchElementException.
     */
    public Double getDouble(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Double.valueOf(value);
    }

    /**
     * Get the double property value, if null or the return type is null than return null, if the result is not double
     * type than throw Exception.
     */
    public Double getDouble(String key, Integer defaultValue) {
        String value = getValue(key);
        return value != null ? Double.valueOf(value) : defaultValue;
    }

    /**
     * Get the boolean property value, if null or the return type is null or not true/false type than throw
     * NoSuchElementException.
     */
    public Boolean getBoolean(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Boolean.valueOf(value);
    }

    /**
     * Get the boolean property value, if null or the return type is null or not true/false type than return false.
     */
    public Boolean getBoolean(String key, boolean defaultValue) {
        String value = getValue(key);
        return value != null ? Boolean.valueOf(value) : defaultValue;
    }

    /**
     * Load multiple property files, locations is files path.
     */
    private Properties loadProperties(String[] resourcesPath) {
        Properties props = new Properties();

        for (String location : resourcesPath) {

            logger.debug("Loading properties file from path:{}", location);

            InputStream is = null;
            try {
                Resource resource = resourceLoader.getResource(location);
                is = resource.getInputStream();
                props.load(is);
            } catch (IOException e) {
                logger.info("Could not load properties from path:{}, {}", location, e.getMessage());
            } finally {
                IOUtils.closeQuietly(is);
            }
        }
        return props;
    }
}
