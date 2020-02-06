package com.mengxuegu.springbootinit01;

import com.mengxuegu.springbootinit01.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import sun.reflect.generics.tree.VoidDescriptor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootInit01ApplicationTests {

    @Autowired
    Student student;
    @Autowired
    ApplicationContext applicationContext;
    @Test
    public void contextLoads() {

        System.out.println(student);

    }
    @Test
    public void  test(){

        System.out.println("studentService:"+applicationContext.getBean("studentService1"));
    }

}
