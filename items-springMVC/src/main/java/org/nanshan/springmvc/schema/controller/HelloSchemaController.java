package org.nanshan.springmvc.schema.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/19.
 * Version 1.0-SNAPSHOT
 */
public class HelloSchemaController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        String msg = "Hello Schema SpringMVC Project , Finally i am win and the jrebel seems nice!";
        modelAndView.addObject("msg", msg);
        modelAndView.setViewName("schema/hello");
        return modelAndView;
    }
}
