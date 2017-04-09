package org.andy.springmvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-21 20:58
 */
@Controller
@RequestMapping(value = "/header")
public class RequestHeaderAnnotationController {

    @RequestMapping("/requestHeaderBindMethod")
    public String requestHeaderBindMethod(Map<String, Object> map,
                                          @RequestHeader(value = "Accept", defaultValue = "") List<String> accepts,
                                          @RequestHeader(value = "user-agent", defaultValue = "default user agent",
                                                  required = false) String userAgent) {
        map.put("msg", accepts + ", " + userAgent);
        return "annotation/message";
    }
}
