package com.action;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@project:com.action
@Title:Hellospring_boot
@Auther:lxl
@create:2018/12/10,12:02
*/
@Controller
public class Hellospring_boot {

    @ResponseBody
    @RequestMapping("/hello")
    public String demo(){
        return "hello spring-boot....";

    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
           new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"--------");
                    Hellospring_boot instance = getInstance();
                    System.out.println(instance);
                }
            },"t"+i).start();
        }


    }

    private static Hellospring_boot hellospring_boot;

    public  static  Hellospring_boot getInstance(){
        if (hellospring_boot==null){
            hellospring_boot=new Hellospring_boot();
        }
        return hellospring_boot;
    }
}
