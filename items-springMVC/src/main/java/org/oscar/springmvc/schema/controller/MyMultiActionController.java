package org.oscar.springmvc.schema.controller;

import org.oscar.springmvc.utils.UrlUtil;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/22.
 * Version 1.0-SNAPSHOT
 */
public class MyMultiActionController extends MultiActionController {


    public String create(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("create : " + UrlUtil.getURL(request) + ", method type : " +
                    UrlUtil.getMethodType(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String delete(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("delete : " + UrlUtil.getURL(request) + ", method type : " +
                    UrlUtil.getMethodType(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String update(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("update : " + UrlUtil.getURL(request) + ", method type : " +
                    UrlUtil.getMethodType(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String list(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("list : " + UrlUtil.getURL(request) + ", method type : " +
                    UrlUtil.getMethodType(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
