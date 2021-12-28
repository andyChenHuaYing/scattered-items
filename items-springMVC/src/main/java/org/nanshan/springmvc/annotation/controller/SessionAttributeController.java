package org.nanshan.springmvc.annotation.controller;

import org.nanshan.springmvc.model.SchoolModel;
import org.nanshan.springmvc.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/22.
 * Version 1.0-SNAPSHOT
 */
@Controller
@RequestMapping("/sessionAttribute")
@SessionAttributes(value = {"userModel"})
public class SessionAttributeController {

    @ModelAttribute("userModel")
    public UserModel initUserModel() {
        return new UserModel("alien", "password", new SchoolModel("anhuiUniversity"));
    }

    @RequestMapping("/sessionOne")
    public String sessionOne(@ModelAttribute("userModel") UserModel userModel) {
        return "annotation/message";
    }

    @RequestMapping("clearSessionAttribute")
    public String clearSessionAttribute(@ModelAttribute("userModel") UserModel userModel, SessionStatus status) {
        status.setComplete();
        return "annotation/message";
    }
}
