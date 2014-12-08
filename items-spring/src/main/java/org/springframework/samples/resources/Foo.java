package org.springframework.samples.resources;

import org.springframework.core.io.Resource;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-02 19:56
 */
public class Foo {
    private Resource template;

    public void setTemplate(Resource template) {
        this.template = template;
    }

    public void showResourceName() {
        System.out.println(template.getFilename());
    }

    public Resource getTemplate() {
        return this.template;
    }
}
