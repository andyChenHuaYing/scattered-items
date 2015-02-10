package org.springframework.samples.ioc.annotation.jsr330;

import org.springframework.samples.model.annotation.AbstractAnnotationModel;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/5.
 * Version 1.0-SNAPSHOT
 */
//@Named
@Named("namedClassLevelAnnotationBean")
public class NamedClassLevelAnnotationBean {
    private AbstractAnnotationModel abstractAnnotationModel;

    @Inject
    public void setAbstractAnnotationModel(@Named("componentAnnotationModel") AbstractAnnotationModel abstractAnnotationModel) {
        this.abstractAnnotationModel = abstractAnnotationModel;
    }

    @Override
    public String toString() {
        return "NamedClassLevelAnnotationBean{" +
                "abstractAnnotationModel=" + abstractAnnotationModel +
                '}';
    }
}
