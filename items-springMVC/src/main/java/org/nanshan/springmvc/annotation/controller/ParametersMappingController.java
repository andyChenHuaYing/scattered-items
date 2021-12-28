package org.nanshan.springmvc.annotation.controller;

import org.nanshan.springmvc.utils.UrlUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Happy daily, happy life.
 * <p/>
 * Description: as the class name and method name description
 * <p/>
 * Created by andychen on 2015/1/21.
 * Version 1.0-SNAPSHOT
 */
@Controller
@RequestMapping(value = "/params/**")
public class ParametersMappingController {

    @RequestMapping(value = "/oneParam", params = {"paramOne"})
    public void withOneParameter(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("with one parameter : parameterOne, url : " + UrlUtil.getURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/oneParam", params = {"paramOneGet"}, method = {RequestMethod.GET})
    public void withOneParameterAndOnlyGetMethod(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("with one parameter : " +
                    "parameterOne and only support get method, url : " + UrlUtil.getURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/oneParam", params = {"paramOnePost"}, method = {RequestMethod.POST})
    public void withOneParameterAndOnlyPostMethod(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("with one parameter : " +
                    "parameterOne and only support post method, url : " + UrlUtil.getURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/twoParams", params = {"paramOne", "paramTwo"})
    public void withTwoParams(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("with two parameters : paramOne + paramTwo, url : " + UrlUtil.getURL(request));
    }

    //    @RequestMapping(value = "/twoParams", params = {"paramOne=valueOne"}) // invalid
//    @RequestMapping(value = "/twoParams", params = "paramOne=valueOne")
//    @RequestMapping(value = "/twoParams", params = {"paramOne", "paramTwo=valueTwo"}) //invalid
    @RequestMapping(params = {"paramOne", "paramTwo=valueTwo"})
    public void withTwoParamsAndSpecifiedValue(HttpServletRequest request,
                                               HttpServletResponse response) {
        try {
            response.getWriter().write("with two parameters and specified values : " +
                    "paramOne=valueOne + paramTwo=valueTwo, url : " + UrlUtil.getURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //    @RequestMapping(value = "/oneParam", params = "!fatalParam")
//    invalid, conflict with  @RequestMapping(value = "/oneParam", params = {"paramOne"})  -- IllegalStateException
    @RequestMapping(value = "/withoutParam", params = "!paramOne")
    public void withoutParam(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("without the specified param--fatalParam, url : "
                    + UrlUtil.getURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
