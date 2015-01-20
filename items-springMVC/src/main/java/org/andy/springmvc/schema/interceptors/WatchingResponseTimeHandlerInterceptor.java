package org.andy.springmvc.schema.interceptors;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-20 21:07
 */
public class WatchingResponseTimeHandlerInterceptor extends HandlerInterceptorAdapter{
    private NamedThreadLocal<Long> threadLocal = new NamedThreadLocal<>("Response Time");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Long startTime = System.currentTimeMillis();
        System.out.println("start time : " + startTime);
        threadLocal.set(startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Long endTime = System.currentTimeMillis();
        System.out.println("end time : " + endTime);
        Long responseTime = endTime - threadLocal.get();
        System.out.println("Response time : " + responseTime + " ms");
        if (responseTime > 500) {
            System.out.println("Response time more then 500ms");
        } else {
            System.out.println("Normal execution");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
