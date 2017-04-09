package org.springframework.samples.resources;

import org.springframework.core.io.Resource;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-02 19:56
 */
public class ResourcesAsDependenciesBean {
    private Resource template;

    public String showResourceName() {
        return template.getFilename();
    }

    public Resource getTemplate() {
        return this.template;
    }

    public void setTemplate(Resource template) {
        this.template = template;
    }
}
