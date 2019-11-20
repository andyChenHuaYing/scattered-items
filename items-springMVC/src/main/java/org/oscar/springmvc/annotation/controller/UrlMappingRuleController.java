package org.oscar.springmvc.annotation.controller;

import org.oscar.springmvc.utils.UrlUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/21.
 * Version 1.0-SNAPSHOT
 */
@Controller
@RequestMapping("url")
public class UrlMappingRuleController {

    @RequestMapping(value = {"/multipleOne", "/multipleTwo", "multipleThree"})
    public void multipleUrlMapping(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("multiple url mapping rule, url : " + UrlUtil.getURL(request));
    }

    @RequestMapping(value = "/propertyOne/{paramOne}/test/{paramTwo}")
    public void templateUrlMapping(HttpServletRequest request, HttpServletResponse response,
                                   @PathVariable(value = "paramOne") String paramOne,
                                   @PathVariable(value = "paramTwo") String paramTwo) throws IOException {
        response.getWriter().write("template url mapping rule, url : " + UrlUtil.getURL(request) + "parameters : " +
                paramOne + ", " + paramTwo);
    }

    //    @RequestMapping(value = "/ant?")
//    @RequestMapping(value = "/ant*")
//    @RequestMapping(value = "/ant/?")
//    @RequestMapping(value = "/ant/*")
//    @RequestMapping(value = "/ant/**")
//    @RequestMapping(value = "/ant/**/{paramOne}")
    @RequestMapping(value = "/ant/?/*")
    public void antStyleUrlMapping(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("ant style url mapping rule, url : " + UrlUtil.getURL(request));
    }

    @RequestMapping(value = "/regular/{paramOne:\\d+}-{paramTwo:\\d+}")
    public void regularUrlMapping(HttpServletRequest request, HttpServletResponse response,
                                  @PathVariable(value = "paramOne") int paramOne,
                                  @PathVariable(value = "paramTwo") int paramTwo) throws IOException {
        response.getWriter().write("regular url mapping rule, url : " + UrlUtil.getURL(request) + "parameters : " +
                paramOne + ", " + paramTwo);
    }

}
