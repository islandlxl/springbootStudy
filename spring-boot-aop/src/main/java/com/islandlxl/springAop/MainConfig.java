package com.islandlxl.springAop;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
public class MainConfig {

    @Bean
    public Caculate caculate() {
        return new CaculateImpl();
    }


    @Bean
    public IslandAspect islandAspect() {
        return new IslandAspect();
    }

}
