package com.mengxuegu.springbootbill.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@project:com.mengxuegu.springbootbill.interceptor
@Title:LoginHandlerInterceptor
@Auther:lxl
@create:2018/12/22,17:38
*/

//掉用目标方法之前进行拦截
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object loginUser=request.getSession().getAttribute("loginUser");

        if (loginUser!=null){

            return true;
        }
        request.setAttribute("msg","无权限，请登录后访问");
        request.getRequestDispatcher("/index.html").forward(request,response);
        return false;
    }
}
