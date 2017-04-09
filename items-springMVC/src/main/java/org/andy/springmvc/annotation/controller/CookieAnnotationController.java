package org.andy.springmvc.annotation.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import java.util.Map;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-21 20:49
 */
@RequestMapping(value = "cookieValue")
public class CookieAnnotationController {

    @RequestMapping("cookieValueUseStringType")
    public String cookieValueWithRequired(@CookieValue(value = "JSESSIONID", required = true, defaultValue = "")
                                                  String sessionId, Map<String, Object> map) {
        map.put("msg", sessionId);
        return "annotation/message";
    }

    @RequestMapping("cookieValueUseCookieType")
    public String cookieValueWithRequired(@CookieValue(value = "JSESSIONID") Cookie sessionId,
                                          Map<String, Object> map) {
        map.put("msg", sessionId.getValue());
        return "annotation/message";
    }
}
