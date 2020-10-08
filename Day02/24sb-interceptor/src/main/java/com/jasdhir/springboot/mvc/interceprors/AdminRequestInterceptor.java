package com.jasdhir.springboot.mvc.interceprors;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminRequestInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = Logger.getLogger(AdminRequestInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        logger.info("Request intercepted @preHandle-AdminRequestInterceptor");
        logger.info("Request URL::" + request.getRequestURL().toString());
        System.out.println("Admin pre");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        logger.info("Request intercepted @postHandle-AdminRequestInterceptor");
        logger.info("Request URL::" + request.getRequestURL().toString());
        System.out.println("Admin Post");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        logger.info("Request intercepted @afterCompletion-AdminRequestInterceptor");
        logger.info("Request URL::" + request.getRequestURL().toString());
        System.out.println("Admin Complete");
    }
}
