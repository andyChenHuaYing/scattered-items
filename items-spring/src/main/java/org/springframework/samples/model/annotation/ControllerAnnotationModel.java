package org.springframework.samples.model.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-03 21:23
 */
@SuppressWarnings("unused")
@Controller
@Qualifier("controllerAnnotationModel")
public class ControllerAnnotationModel extends AbstractAnnotationModel {
    @Override
    public String toString() {
        return "ControllerAnnotationModel{}";
    }
}
