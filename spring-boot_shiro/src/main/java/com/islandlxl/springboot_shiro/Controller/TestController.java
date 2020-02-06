package com.islandlxl.springboot_shiro.Controller;

import com.islandlxl.springboot_shiro.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/*
@project:com.islandlxl.springboot_shiro.Controller
@Title:TestController
@Auther:lxl
@create:2019/1/25,16:12
*/
@Controller
public class TestController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        if (subject!=null){
            subject.logout();
        }
        return "login";
    }
    @ResponseBody
    @RequestMapping("/admin")
    public String admin(){
        return "admin success";
    }
    @RequestMapping("/loginUser")
    public String loginUser(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpSession session){

        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password);

        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(usernamePasswordToken);
            User user = (User) subject.getPrincipal();
            session.setAttribute("user",user);
            return "index";

        } catch (Exception e) {

            return "login";
        }

    }


}
