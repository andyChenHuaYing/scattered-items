package org.springframework.samples.model.annotation;

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
public class ControllerAnnotationModel {
    @Override
    public String toString() {
        return "ControllerAnnotationModel{}";
    }
}
