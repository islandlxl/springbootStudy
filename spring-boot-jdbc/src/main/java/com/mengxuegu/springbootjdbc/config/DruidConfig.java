package com.mengxuegu.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
@project:com.mengxuegu.springbootjdbc.config
@Title:DruidConfig
@Auther:lxl
@create:2018/12/29,11:27
*/
@Configuration
@EnableConfigurationProperties(value = DruidDataSourceProperties.class)
public class DruidConfig {

    @Autowired
    private DruidDataSourceProperties druidDataSourceProperties;
//    绑定数据源的配置

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() throws SQLException {
        System.out.println(druidDataSourceProperties);
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(druidDataSourceProperties.getUsername());
        druidDataSource.setPassword(druidDataSourceProperties.getPassword());
        druidDataSource.setUrl(druidDataSourceProperties.getUrl());
        druidDataSource.setDriverClassName(druidDataSourceProperties.getDriverClassName());
        druidDataSource.setInitialSize(druidDataSourceProperties.getInitialSize());
        druidDataSource.setMinIdle(druidDataSourceProperties.getMinIdle());
        druidDataSource.setMaxActive(druidDataSourceProperties.getMaxActive());
        druidDataSource.setMaxWait(druidDataSourceProperties.getMaxWait());
        druidDataSource.setFilters(druidDataSourceProperties.getFilters());
        druidDataSource.setPoolPreparedStatements(druidDataSourceProperties.isPoolPreparedStatements());

        return new DruidDataSource();
    }

    /**
     *  配置一个监控
     *   管理后台的servlet，配置一个监控的filter
     **/
    @Bean
    public ServletRegistrationBean  statViewServlet(){

//        statViewServlet是一个管理后台的servlet
        ServletRegistrationBean<StatViewServlet> bean=new ServletRegistrationBean<>(
                new StatViewServlet(),"/druid/*");
//   配置初始化参数
        Map<String,String> map=new HashMap<String, String>();
//        访问的用户名和密码
        map.put(StatViewServlet.PARAM_NAME_JMX_USERNAME,"root");
        map.put(StatViewServlet.PARAM_NAME_JMX_PASSWORD,"123");
        map.put(StatViewServlet.PARAM_NAME_ALLOW,"");
        map.put(StatViewServlet.PARAM_NAME_DENY,"192.168.0.103");
        bean.setInitParameters(map);
        return bean;
    }

//    配置一个filter监控
    @Bean
    public FilterRegistrationBean filter(){

       FilterRegistrationBean<Filter> bean=new FilterRegistrationBean<Filter>();

       bean.setFilter(new WebStatFilter());

//       配置初始化参数
        Map<String,String> map=new HashMap<>();
//        排除请求
        map.put(WebStatFilter.PARAM_NAME_EXCLUSIONS,"*.js,*.css,/druid/*");
//       拦截所有的请求
        bean.setUrlPatterns(Arrays.asList("/*"));

        return bean;

    }


}
