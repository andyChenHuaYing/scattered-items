package org.andy.springmvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/19.
 * Version 1.0-SNAPSHOT
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/hello")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("annotation/index");
        String msg = "Running IndexController.index() method";
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }
}
