package org.springframework.samples.utils;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-03 20:16
 */
public class ClasspathUtils {

    /**
     *
     * @param resourceName
     * @return classpath
     */
    public String getClasspathByResourceName(String resourceName) {
        return this.getClass().getClassLoader().getResource(resourceName).getPath();
    }

    public String getClasspath() {
        return this.getClass().getClassLoader().getResource("").getPath();
    }
}
