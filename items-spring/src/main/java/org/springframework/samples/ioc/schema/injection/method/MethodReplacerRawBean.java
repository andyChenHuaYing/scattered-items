package org.springframework.samples.ioc.schema.injection.method;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-26 21:27
 */
public class MethodReplacerRawBean {

    public String replacedMethod(String string) {
        System.out.println("Parameter " + string + " will be replaced!");
        return "This method return will be replaced possibly!";
    }

    @Override
    public String toString() {
        return "MethodReplacerRawBean{}";
    }
}
