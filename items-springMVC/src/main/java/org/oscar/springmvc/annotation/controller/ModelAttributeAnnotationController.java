package org.oscar.springmvc.annotation.controller;

import org.oscar.springmvc.model.SchoolModel;
import org.oscar.springmvc.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-21 21:21
 */
@Controller
@RequestMapping("/modelAttribute")
public class ModelAttributeAnnotationController {

    /**
     * Bind form data on UserModel, The mapping relationship between form and UserModel depends on form's name attribute
     * and provide user reference to view.
     *
     * @param userModel Data Model.
     * @return View.
     */
    @RequestMapping("/methodParamModelAttribute")
    public String methodParamModelAttribute(@ModelAttribute("user") UserModel userModel) {
        return "annotation/message";
    }

    /**
     * Prepare model for next view which is produced by biz method.
     *
     * @return modelList List<UserModel>.
     */
    @ModelAttribute("modelList")
    public List<UserModel> prepareUserModelList() {
        List<UserModel> userModels = new ArrayList<>();
        userModels.add(new UserModel("alien", "alien", new SchoolModel("anhuiUniversity")));
        userModels.add(new UserModel("star", "star", new SchoolModel("caohuCollege")));
        return userModels;
    }

    @RequestMapping("/validatePrepareMethodLevelModelAttribute")
    public String validatePrepareMethodLevelModelAttribute() {
        return "annotation/message";
    }

    public
    @ModelAttribute("userModel")
    UserModel methodLast(@ModelAttribute("userModel") UserModel userModel) {
        return new UserModel("alien", "alien", new SchoolModel("anhuiUniversity"));
    }
}
