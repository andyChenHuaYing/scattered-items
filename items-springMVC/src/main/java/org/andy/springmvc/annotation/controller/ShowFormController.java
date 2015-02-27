package org.andy.springmvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-21 21:25
 */
@Controller
public class ShowFormController {
    @RequestMapping("/showTempForm")
    public String showForm() {
        return "annotation/index";
    }
}
