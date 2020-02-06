package com.mengxuegu.springbootjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

/*
* 用于测试与数据源的连接
* */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJdbcApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    public void contextLoads() throws Exception{
        System.out.println("dataSource:"+ dataSource.getClass());

          Connection connection =dataSource.getConnection();

          System.out.println(connection);

          connection.close();
    }

}

