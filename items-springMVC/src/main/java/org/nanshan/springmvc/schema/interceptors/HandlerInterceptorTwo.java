package org.nanshan.springmvc.schema.interceptors;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-20 20:36
 */
public class HandlerInterceptorTwo extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("HandlerInterceptorTwo preHandler ...");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("HandlerInterceptorTwo postHandler...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("HandlerInterceptorTwo afterCompletion...");
    }
}
