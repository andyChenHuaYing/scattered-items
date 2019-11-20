package org.oscar.springmvc.schema.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/19.
 * Version 1.0-SNAPSHOT
 */
public class HelloSchemaControllerExtendsAbstractController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        String msg = "Hello Schema controller extends AbstractController !";
        modelAndView.setViewName("schema/abstractController");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }
}
