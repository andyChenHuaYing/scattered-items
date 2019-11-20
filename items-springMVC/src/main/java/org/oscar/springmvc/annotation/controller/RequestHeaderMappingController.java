package org.oscar.springmvc.annotation.controller;

import org.oscar.springmvc.utils.UrlUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Happy daily, happy life.
 * <p/>
 * Description: As the class name and method name meaning.
 * <p/>
 * Created by andychen on 2015/1/21.
 * Version 1.0-SNAPSHOT
 */
@Controller
@RequestMapping(value = "/header")
public class RequestHeaderMappingController {

    @RequestMapping(value = "/withAccept", headers = "Accept")
    public void headerWithAccept(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("Request Header with any Accept type, headers : "
                    + UrlUtil.getHeaders(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/withSpecifiedAccept", headers = "Accept=text/plain")
    public void headerWithSpecifiedAcceptType(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("Request Header with Accept = text/plain type, headers : "
                    + UrlUtil.getHeaders(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/withAnyAcceptType", headers = "Accept=*/*")
    public void headerWithAnyAcceptType(HttpServletResponse response) {
        try {
            response.getWriter().write("Request header with andy Accept type.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/withoutSpecifiedParamType", headers = "!fatal")
    public void headerWithoutSpecifiedParamType(HttpServletResponse response) {
        try {
            response.getWriter().write("Request header without fatal param.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/headerWithTwoNecessaryParam", headers = {"Accept=text/*", "!fatal"})
    public void headerWithTwoNecessaryParam(HttpServletResponse response) {
        try {
            response.getWriter().write("Request header with Accept and without fatal param");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
