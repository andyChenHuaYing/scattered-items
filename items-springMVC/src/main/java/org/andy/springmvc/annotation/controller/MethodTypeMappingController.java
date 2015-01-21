package org.andy.springmvc.annotation.controller;

import org.andy.springmvc.utils.UrlUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/21.
 * Version 1.0-SNAPSHOT
 */
@Controller
@RequestMapping("/method")
public class MethodTypeMappingController {

    @RequestMapping(value = "/getType", method = RequestMethod.GET)
    public void onlyGETMethodType(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("Only process get method, url : " + UrlUtil.getURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/postType", method = RequestMethod.POST)
    public void onlyPOSTMethodType(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("Only process post method, url : " + UrlUtil.getURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/getAndPostType", method = {RequestMethod.GET, RequestMethod.POST})
    public void getAndPostMethodType(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("Process get and post method, url : " + UrlUtil.getURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
