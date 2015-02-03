package org.springframework.samples.ioc.annotation.annotation.based.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.samples.model.PlainModelFour;
import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelThree;
import org.springframework.samples.model.PlainModelTwo;

import javax.annotation.Resource;

/**
 * Happy daily, happy life.
 * <p/>
 * Description: @Resource first looks for name, then fall backs to a primary type match for the specified type.
 * <p/>
 * Created by andychen on 2015/2/3.
 * Version 1.0-SNAPSHOT
 */
public class ResourceAnnotationBean {
    //Inject by name;
    @Resource(name = "plainModelOnlyOneSingleton")
    private PlainModelOne plainModelOne;

    //Inject by field property name;
    @Resource
    private PlainModelThree plainModelOnlyThreeSingleton;

    //Inject by type;
    @Resource
    private PlainModelTwo plainModelTwo;

    //Inject by setter method;
    private PlainModelFour plainModelFour;

    @Resource
    private ApplicationContext context;

    @Resource
    public void setPlainModelFour(PlainModelFour plainModelFourOnlyFourSingleton) {
        this.plainModelFour = plainModelFourOnlyFourSingleton;
    }

    @Override
    public String toString() {
        return "ResourceAnnotationBean{" +
                "plainModelOne=" + plainModelOne +
                ", plainModelOnlyThreeSingleton=" + plainModelOnlyThreeSingleton +
                ", plainModelTwo=" + plainModelTwo +
                ", plainModelFour=" + plainModelFour +
                ", context=" + context.getClass().getSimpleName() +
                '}';
    }

}
