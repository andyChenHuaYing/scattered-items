package org.nanshan.springmvc.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/21.
 * Version 1.0-SNAPSHOT
 */
public class UrlUtil {

    /**
     * Get url .
     *
     * @param request HttpServletRequest .
     * @return String value of url.
     */
    public static String getURL(HttpServletRequest request) {
        return request.getRequestURL().toString();
    }

    public static String getHeaders(HttpServletRequest request) {
        StringBuilder stringBuffer = new StringBuilder();
        Enumeration<String> headersName = request.getHeaderNames();
        while (headersName.hasMoreElements()) {
            stringBuffer.append(headersName.nextElement()).append(", ");
        }
        return stringBuffer.substring(0, stringBuffer.lastIndexOf(","));
    }

    public static String getMethodType(HttpServletRequest request) {
        return request.getMethod();
    }
}

