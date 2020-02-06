package com.mengxuegu.springboot_loging_03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLoging03ApplicationTests {

     Logger logger=LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {

        logger.trace("这是trace级别");
        logger.debug("这是debug级别");
        logger.info("这是info级别");
        logger.warn("这是warn级别");
        logger.error("这是error级别");

    }

}
