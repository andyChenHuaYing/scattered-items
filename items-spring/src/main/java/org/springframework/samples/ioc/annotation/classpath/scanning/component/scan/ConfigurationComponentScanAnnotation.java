package org.springframework.samples.ioc.annotation.classpath.scanning.component.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.model.annotation.ComponentAnnotationModel;
import org.springframework.samples.model.annotation.ControllerAnnotationModel;
import org.springframework.samples.model.annotation.RepositoryAnnotationModel;
import org.springframework.samples.model.annotation.ServiceAnnotationModel;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-03 21:22
 */
@Configuration
@ComponentScan("org.springframework.samples.model.annotation")
public class ConfigurationComponentScanAnnotation {
    @Autowired
    private ComponentAnnotationModel componentAnnotationModel;
    @Autowired
    private ControllerAnnotationModel controllerAnnotationModel;
    @Autowired
    private ServiceAnnotationModel serviceAnnotationModel;
    @Autowired
    private RepositoryAnnotationModel repositoryAnnotationModel;

    @Override
    public String toString() {
        return "ComponentScanAnnotation{" +
                "componentAnnotationModel=" + componentAnnotationModel +
                ", controllerAnnotationModel=" + controllerAnnotationModel +
                ", serviceAnnotationModel=" + serviceAnnotationModel +
                ", repositoryAnnotationModel=" + repositoryAnnotationModel +
                '}';
    }
}
