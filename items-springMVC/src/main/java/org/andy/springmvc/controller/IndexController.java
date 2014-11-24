package org.andy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-18 19:12
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index/index");
        String msg = "Running IndexController.index() method";
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }
}
