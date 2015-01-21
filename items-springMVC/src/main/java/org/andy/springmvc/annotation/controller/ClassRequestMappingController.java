package org.andy.springmvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/21.
 * Version 1.0-SNAPSHOT
 */
@Controller
@RequestMapping("/hello")
public class ClassRequestMappingController {

    @RequestMapping("/detail")
    public ModelAndView processMethod() {
        ModelAndView modelAndView = new ModelAndView();
        String msg = "Narrow RequestMapping !";
        modelAndView.addObject("msg", msg);
        modelAndView.setViewName("annotation/index");
        return modelAndView;
    }
}
