package org.oscar.springmvc.annotation.controller;

import org.oscar.springmvc.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/22.
 * Version 1.0-SNAPSHOT
 */
@Controller
@RequestMapping("/validate")
public class ValidateController {

    @RequestMapping("/validateUserModel")
    public String validateUserModel(@Valid @ModelAttribute("userModel") UserModel userModel, Errors errors) {
        if (errors.hasErrors()) {
            return "annotation/errors";
        } else {
            return "annotation/message";
        }
    }
}
