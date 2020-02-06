package com.mengxuegu.springbootbill.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/*
@project:com.mengxuegu.springbootbill.component
@Title:MyErrorAttributes
@Auther:lxl
@create:2018/12/24,11:24
*/
//错误处理机制
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {

        Map<String,Object> map= super.getErrorAttributes(webRequest, includeStackTrace);

        map.put("company","百度有限公司");
        return map;

    }
}
