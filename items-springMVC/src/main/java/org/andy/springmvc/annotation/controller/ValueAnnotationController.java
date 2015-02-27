package org.andy.springmvc.annotation.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
@Controller
@RequestMapping("/value")
public class ValueAnnotationController {

    @RequestMapping(value = "/validateValueAnnotation")
    public String validateValueAnnotation(@Value("#{systemProperties['java.vm.version']}") String jvmVersion,
                                          HttpServletResponse response) {
        try {
            response.getWriter().write("jvm version : " + jvmVersion);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
