package org.nanshan.springmvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-21 19:35
 */
@Controller
@RequestMapping(value = "/requestParam")
public class RequestParamAnnotationController {

    @RequestMapping("/requestParamWithoutValuePro")
    public String requestParamWithoutValuePro(@RequestParam String param, Model model) {
        model.addAttribute("msg", param);
        return "annotation/message";
    }

    @RequestMapping("/requestParamWithValuePro")
    public String requestParamWithValuePro(@RequestParam(value = "param") String param, Model model) {
        model.addAttribute("msg", param);
        return "annotation/message";
    }

    @RequestMapping("/requestParamWithRequiredProFalse")
    public String requestParamWithRequiredProFalse(@RequestParam(value = "param", required = false)
                                                           String param, Model model) {
        model.addAttribute("msg", param);
        return "annotation/message";
    }

    @RequestMapping("/requestParamWithRequiredProDefault")
    public String requestParamWithRequiredProDefault(@RequestParam(value = "param")
                                                             String param, Model model) {
        model.addAttribute("msg", param);
        return "annotation/message";
    }

    @RequestMapping("/requestParamWithDefaultValue")
    public String requestParamWithDefaultValue(
            @RequestParam(value = "param", required = false, defaultValue = "alien") String param, Model model) {
        model.addAttribute("msg", param);
        return "annotation/message";
    }

    @RequestMapping("/requestParamWithRequiredProDefaultValue")
    public String requestParamWithRequiredProDefaultValue(
            @RequestParam(value = "param", required = true, defaultValue = "alien") String param, Model model) {
        model.addAttribute("msg", param);
        return "annotation/message";
    }

    @RequestMapping("/multipleValueInjectStringParam")
    //localhost:8080/requestParam/multipleValueInjectStringParam?param=alien&param=star
    //Result : alien,star
    public String multipleValueInjectStringParam(@RequestParam(value = "param", required = false)
                                                         String param, Model model) {
        model.addAttribute("msg", param);
        return "annotation/message";
    }

    @RequestMapping("/multipleValueInjectStringArrayParam")
    //http://localhost:8080/requestParam/multipleValueInjectListParam?param=alien&param=star
    //Result : [Ljava.lang.String;@77103969
    public String multipleValueInjectStringArrayParam(@RequestParam(value = "param", required = false)
                                                              String[] param, Model model) {
        model.addAttribute("msg", param);
        return "annotation/message";
    }

    @RequestMapping("/multipleValueInjectListParam")
    //http://localhost:8080/requestParam/multipleValueInjectListParam?param=alien&param=star
    //Result : [alien, star]
    public String multipleValueInjectListParam(@RequestParam(value = "param", required = false)
                                                       List<String> param, Model model) {
        model.addAttribute("msg", param);
        return "annotation/message";
    }

}
