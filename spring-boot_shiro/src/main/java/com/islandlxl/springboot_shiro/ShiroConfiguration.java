package com.islandlxl.springboot_shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/*
@project:com.islandlxl.springboot_shiro
@Title:ShiroConfigration
@Auther:lxl
@create:2019/1/25,15:40
*/
@Configuration
public class ShiroConfiguration {

    @Bean("shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(@Qualifier("securityManager") SecurityManager manager){
        ShiroFilterFactoryBean bean=new ShiroFilterFactoryBean();
        bean.setSecurityManager(manager);
        bean.setLoginUrl("/login");
        bean.setSuccessUrl("/index");
        bean.setUnauthorizedUrl("/unauthorized");

        LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put("/index", "authc");
        linkedHashMap.put("/login", "anon");
        linkedHashMap.put("/loginUser", "anon");
        linkedHashMap.put("/admin", "roles[admin]");
        linkedHashMap.put("/edit", "perms[edit]");
        linkedHashMap.put("/druid/**", "anon");
        linkedHashMap.put("/**", "user");

        bean.setFilterChainDefinitionMap(linkedHashMap);

        return bean;
    }


    @Bean("securityManager")
    public SecurityManager securityManager(@Qualifier("authRealm") AuthRealm authRealm){

        DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
        manager.setRealm(authRealm);
        return manager;
    }


    @Bean("authRealm")
    public AuthRealm authRealm(@Qualifier("credentialMacher") CredentialMacher macher){

        AuthRealm authRealm=new AuthRealm();
        authRealm.setCredentialsMatcher(macher);
        return authRealm;
    }


    @Bean("credentialMacher")
    public CredentialMacher credentialMacher(){
        return new CredentialMacher();
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor sourceAdvisor(@Qualifier("securityManager") SecurityManager manager){

        AuthorizationAttributeSourceAdvisor advisor=new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(manager);
        return advisor;
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator creator=new DefaultAdvisorAutoProxyCreator();
        creator.setProxyTargetClass(true);
        return creator;
    }

}
