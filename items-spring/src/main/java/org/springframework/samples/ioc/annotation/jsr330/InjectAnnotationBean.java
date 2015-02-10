package org.springframework.samples.ioc.annotation.jsr330;

import org.springframework.samples.model.annotation.*;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.Map;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/5.
 * Version 1.0-SNAPSHOT
 */
@Component
public class InjectAnnotationBean {
    @Inject
    private ComponentAnnotationModel componentAnnotationModel;
    private ControllerAnnotationModel controllerAnnotationModel;

    private ServiceAnnotationModel serviceAnnotationModel;

    private RepositoryAnnotationModel repositoryAnnotationModel;
    @Inject
    private Map<String, AbstractAnnotationModel> abstractAnnotationModelMap;

    @Inject
    public InjectAnnotationBean(ServiceAnnotationModel serviceAnnotationModel, RepositoryAnnotationModel repositoryAnnotationModel) {
        this.serviceAnnotationModel = serviceAnnotationModel;
        this.repositoryAnnotationModel = repositoryAnnotationModel;
    }

    @Inject
    public void setControllerAnnotationModel(ControllerAnnotationModel controllerAnnotationModel) {
        this.controllerAnnotationModel = controllerAnnotationModel;
    }

    @Override
    public String toString() {
        return "InjectAnnotationBean{" +
                "componentAnnotationModel=" + componentAnnotationModel +
                ", controllerAnnotationModel=" + controllerAnnotationModel +
                ", serviceAnnotationModel=" + serviceAnnotationModel +
                ", repositoryAnnotationModel=" + repositoryAnnotationModel +
                ", abstractAnnotationModelMap=" + abstractAnnotationModelMap +
                '}';
    }
}
