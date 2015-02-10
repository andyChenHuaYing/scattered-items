package org.springframework.samples.ioc.annotation.classpath.scanning.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.samples.model.annotation.PlainAnnotationModelOne;
import org.springframework.stereotype.Component;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-04 21:43
 */
@Component
public class BeanCombineComponentAnnotationSimple {

    @Bean
    @Qualifier("plainAnnotationModelOne")
    public PlainAnnotationModelOne plainAnnotationModelOne() {
        return new PlainAnnotationModelOne();
    }

    @Override
    public String toString() {
        return "BeanCombineComponentAnnotationSimple{}";
    }
}
