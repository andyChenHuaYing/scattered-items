package org.springframework.samples.model.annotation;

import org.springframework.stereotype.Service;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-03 21:23
 */
@SuppressWarnings("unused")
@Service
public class ServiceAnnotationModel {
    @Override
    public String toString() {
        return "ControllerAnnotationModel{}";
    }
}
