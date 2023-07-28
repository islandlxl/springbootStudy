package com.mengxuegu.springbootservlet.config;

import com.mengxuegu.springbootservlet.Filter.MyFilter;
import com.mengxuegu.springbootservlet.Listener.MyListener;
import com.mengxuegu.springbootservlet.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/*
@project:com.mengxuegu.springbootservlet.config
@Title:MyServletConfig
@Auther:lxl
@create:2018/12/24,12:35
*/
@Configuration
public class MyServletConfig implements WebMvcConfigurer {



    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer(){

        return new WebServerFactoryCustomizer() {
            @Override
            public void customize(WebServerFactory factory) {

                ConfigurableWebServerFactory factory1=(ConfigurableWebServerFactory) factory;

                factory1.setPort(8088);

            }
        };
    }


    @Bean
    public ServletRegistrationBean helloServlet(){

        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<MyServlet>(new MyServlet(),"/hello");
//         设置加载顺序
        bean.setLoadOnStartup(1);
        return bean;
    }
    @Bean
    public FilterRegistrationBean myfilter(){


        FilterRegistrationBean<MyFilter> bean = new FilterRegistrationBean<>();

        bean.setFilter(new MyFilter());
        bean.setUrlPatterns(Arrays.asList("/hello"));
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean mylistener(){
        ServletListenerRegistrationBean<MyListener> bean = new ServletListenerRegistrationBean<>(new MyListener());
        return bean;

    }
//
//    public  void myInterceptor(InterceptorRegistry register){
//        register.addInterceptor(new MyInterceptor()).addPathPatterns("*/**").excludePathPatterns("/index.html","/");
//
//    }


    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new com.mengxuegu.springbootservlet.config.LoginInterceptor()).addPathPatterns("/**");
     //   registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/loginjudge","/","/retolo","/static/**");

    }
}
