package com.mengxuegu.springbootinit01.config;

import com.mengxuegu.springbootinit01.Service.IslandBeanPostProcessor;
import com.mengxuegu.springbootinit01.Service.IslandService;
import com.mengxuegu.springbootinit01.bean.*;
import com.mengxuegu.springbootinit01.dao.IslandDao;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;

/*
@project:com.mengxuegu.springbootinit01.Service
@Title:StudentConfig
@Auther:lxl
@create:2018/12/11,19:37
*/
@Configuration
//@Import(value = {IslandImportSelector.class})
//@PropertySource(value = {"classpath:member.properties"})
@ComponentScan(value = "com.mengxuegu.springbootinit01.controller")
public class MainConfig /*implements EmbeddedValueResolverAware */{

//    private String url;
//
//    @Override
//    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
//        this.url=stringValueResolver.resolveStringValue("${avatar}");
//    }
//
//    @Override
//    public String toString() {
//        return "MainConfig{" +
//                "url='" + url + '\'' +
//                '}';
//    }

    @Bean
    public IslandDao islandDao(){
        IslandDao islandDao = new IslandDao();
        islandDao.setFlag(1);
        return islandDao;
    }

    @Bean
    public IslandDao islandDao2(){
        IslandDao islandDao2 = new IslandDao();
        islandDao2.setFlag(2);
        return islandDao2;
    }

    @Bean(autowire= Autowire.BY_NAME)
    public IslandService islandService(){
        return new IslandService();
    }

//    @Bean
//    public Member member(){
//        return new Member();
//    }


//    @Bean
//    public Score score(){
//        return new Score();
//    }
//
//    @Bean
//    public Course course(){
//        return new Course();
//    }
//
//    @Bean
//    public IslandBeanPostProcessor islandBeanPostProcessor(){
//        return new IslandBeanPostProcessor();
//    }

//    @Bean
//    //@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    public Teacher teacher(){
//        return new Teacher();
//    }
//    @Bean
//    public ScoreFactoryBean scoreFactoryBean(){
//        return new ScoreFactoryBean();
//    }

//    @Bean
//    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    public Teacher teacher(){
//        return new Teacher();
//    }
//
//    @Bean
//    public StudentService studentService1(){
//        return new StudentService();
//    }

//
//    @Bean
//    @Conditional(value = BeanCondition.class)
//    public Forte forte(){
//        return new Forte();
//    }
}
