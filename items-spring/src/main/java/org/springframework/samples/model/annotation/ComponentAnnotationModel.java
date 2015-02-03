package org.springframework.samples.model.annotation;

import org.springframework.stereotype.Component;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-03 21:23
 */
@SuppressWarnings("unused")
@Component
public class ComponentAnnotationModel {
    @Override
    public String toString() {
        return "ControllerAnnotationModel{}";
    }
}
