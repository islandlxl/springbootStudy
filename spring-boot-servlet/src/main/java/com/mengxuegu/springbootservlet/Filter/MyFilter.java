package com.mengxuegu.springbootservlet.Filter;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;

/*
@project:com.mengxuegu.springbootservlet.Filter
@Title:MyFilter
@Auther:lxl
@create:2018/12/24,12:51
*/

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化。。");
    }

    @Override
    public void destroy() {

        System.out.println("过滤器销毁。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("过滤完成了");

        filterChain.doFilter(servletRequest,servletResponse);
    }
}
