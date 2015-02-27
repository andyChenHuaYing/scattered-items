package org.andy.springmvc.schema.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/20.
 * Version 1.0-SNAPSHOT
 */
public class HelloSchemaOnlyPostController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            ModelAndView modelAndView = new ModelAndView();
            String msg = "This is post method !";
            modelAndView.addObject("msg", msg);
            modelAndView.setViewName("schema/post");
            return modelAndView;
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Only Support POST method!");
        }
        return null;
    }
}
