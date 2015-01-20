package org.andy.springmvc.schema.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/20.
 * Version 1.0-SNAPSHOT
 */
public class HelloSchemaLastModifiedController extends AbstractController implements LastModified {

    private long lastModified;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("<a href=''>this</a>");
        return null;
    }

    @Override
    public long getLastModified(HttpServletRequest request) {
        if (lastModified == 0L) {
            lastModified = System.currentTimeMillis();
        }
        return lastModified;
    }
}
