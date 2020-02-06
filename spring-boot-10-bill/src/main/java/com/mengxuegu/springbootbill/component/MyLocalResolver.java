package com.mengxuegu.springbootbill.component;


/*
@project:com.mengxuegu.springbootbill.component
@Title:MyLocalResolver
@Auther:lxl
@create:2018/12/22,10:27
*/


import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocalResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String l=httpServletRequest.getParameter("l");
//获取默认的区域信息
        Locale locale=Locale.getDefault();
        if (!StringUtils.isEmpty(l)){
            String[] split=l.split("_");

            locale=new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
