package com.jasdhir.springboot.mvc.interceprors;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserRequestInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = Logger.getLogger(UserRequestInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        logger.info("Request intercepted @preHandle-UserRequestInterceptor");
        logger.info("Request URL::" + request.getRequestURL().toString());

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        logger.info("Request intercepted @postHandle-UserRequestInterceptor");
        logger.info("Request URL::" + request.getRequestURL().toString());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        logger.info("Request intercepted @afterCompletion-UserRequestInterceptor");
        logger.info("Request URL::" + request.getRequestURL().toString());
    }
}