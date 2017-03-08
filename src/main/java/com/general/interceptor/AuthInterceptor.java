package com.general.interceptor;

import com.basic.auth.Auth;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by joanna on 12/27/16.
 */
public class AuthInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String accessToken=httpServletRequest.getHeader("access-token");
        String resource=httpServletRequest.getHeader("echh-resource");
        String operation=httpServletRequest.getHeader("echh-operation");
        /*boolean isAllowed=new Auth().validate(accessToken,resource,operation);
        System.out.println("Is allowd for auth? "+isAllowed);*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
