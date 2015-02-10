package org.springframework.samples.ioc.annotation.classpath.scanning.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.samples.model.annotation.AbstractPlainAnnotationModelOne;
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
public class BeanCombineComponentAnnotationComplex {

    private static int i;

    @Bean
    @Qualifier("publicPlainAnnotationModelOne")
    public PlainAnnotationModelOne publicPlainAnnotationModelOne() {
        return new PlainAnnotationModelOne();
    }

    @Bean
    protected PlainAnnotationModelOne protectedPlainAnnotationModelOne(
            @Qualifier("plainAnnotationModelOne") AbstractPlainAnnotationModelOne modelOne,
            @Value("#{privatePlainAnnotationModelOne.string}") String string) {
        PlainAnnotationModelOne modelOne1 = new PlainAnnotationModelOne(1, "protectedPlainAnnotationModelOne");
        modelOne1.setString(string);
        modelOne1.setAbstractPlainAnnotationModelOne(modelOne);
        return modelOne1;
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    private PlainAnnotationModelOne privatePlainAnnotationModelOne() {
        return new PlainAnnotationModelOne(i++, "privatePlainAnnotationModelOne");
    }

    @Bean
//    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public PlainAnnotationModelOne requestScopePlainAnnotationModelOne() {
        return new PlainAnnotationModelOne(3);
    }

    @Override
    public String toString() {
        return "BeanCombineComponentAnnotationSimple{}";
    }
}
