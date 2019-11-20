package org.oscar.springmvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-21 20:25
 */
@Controller
@RequestMapping(value = "/pathVariable")
public class PathVariableAnnotationController {

    @RequestMapping(value = "/{paramOne}/path/{paramTwo}")
    public String pathVariable(@PathVariable(value = "paramOne") String paramOne,
                               @PathVariable(value = "paramTwo") String paramTwo, ModelMap modelMap) {
        modelMap.addAttribute("msg", paramOne + ", " + paramTwo);
        return "annotation/message";
    }
}
