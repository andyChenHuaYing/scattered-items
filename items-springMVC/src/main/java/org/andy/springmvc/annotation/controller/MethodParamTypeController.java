package org.andy.springmvc.annotation.controller;

import org.andy.springmvc.model.UserModel;
import org.andy.springmvc.utils.UrlUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Map;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/21.
 * Version 1.0-SNAPSHOT
 */
@Controller
@RequestMapping("/param")
@SuppressWarnings("unused")
public class MethodParamTypeController {

    @RequestMapping("/showLoginForm")
    public String showForm() {
        return "annotation/index";
    }

    /**
     * After execution, springMVC will find /WEB-INF/views/param/methodParamType/modelParam.jsp.
     * If you want to stop it, just return null to tell springMVC it's end.
     *
     * @param request   HttpServletRequest.
     * @param userModel Custom define UserModel--Form data.
     */
    @RequestMapping(value = "/methodParamType/modelParam", method = RequestMethod.POST)
    public void customModel(HttpServletRequest request, UserModel userModel) {
        System.out.println(request.getCharacterEncoding());
        System.out.println(userModel);
    }


    @RequestMapping(value = "/mapModelModelMap")
    public ModelAndView mapModelModelMap(Map<String, Object> map, Model model, ModelMap modelMap) {
        map.put("a", "a");
        model.addAttribute("a", "b");
        modelMap.addAttribute("a", "c");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("a", "d");
        modelAndView.setViewName("annotation/message");
        System.out.println(map == model);
        System.out.println(model == modelMap);
        return modelAndView;
    }

    @RequestMapping(value = "/requestAndResponse")
    public String requestAndResponse(ServletRequest servletRequest, ServletResponse servletResponse,
                                     HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write(UrlUtil.getURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @RequestMapping("/readAndWriter")
    public String readerAndWriter(Reader reader, Writer writer) {
        try {
            writer.write(reader.getClass().getSimpleName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/inputStreamAndOutputStream")
    public String inputStreamAndOutputStream(InputStream requestBodyIn, OutputStream responseBodyOut) {
        try {
            responseBodyOut.write(requestBodyIn.getClass().getName().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/webRequest")
    public String webRequest(WebRequest webRequest, NativeWebRequest nativeWebRequest) {
        webRequest.setAttribute("a", "a", WebRequest.SCOPE_REQUEST);
        System.out.println(webRequest.getAttribute("a", WebRequest.SCOPE_REQUEST));
        HttpServletRequest request =
                nativeWebRequest.getNativeRequest(HttpServletRequest.class);
        HttpServletResponse response =
                nativeWebRequest.getNativeResponse(HttpServletResponse.class);
        return "annotation/message";
    }

    @RequestMapping("/httpSession")
    public String httpSession(HttpSession httpSession) {
        httpSession.setAttribute("a", "HttpSession");
        return "annotation/message";
    }

    @RequestMapping("/errorOne")
    public String errorsOne(UserModel userModel, BindingResult bindingResult) {
        return null;
    }

    @RequestMapping("/errorTwo")
    public String errorsTwo(UserModel userModel, Errors errors) {
        return null;
    }

    @RequestMapping("/errorThree")
    public String errorsThree(UserModel userModel, BindingResult bindingResult, Model model) {
        return null;
    }
}
