package com.mengxuegu.springbootbill.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/*
@project:com.mengxuegu.springbootbill.Controller
@Title:LoginController
@Auther:lxl
@create:2018/12/22,11:26
*/
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(HttpSession session
             , @RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map){

        if (!StringUtils.isEmpty(username)&& "123".equals(password)){


            session.setAttribute("loginUser",username);

            return "redirect:main.html";
        }

//        登录失败

        map.put("msg","用户名和密码错误");
        return "main/login";

    }

//    退出登陆
    @GetMapping("/loginout")
    public String loginout(HttpSession session){
        session.removeAttribute("loginUser");

        session.invalidate();

        return "index.html";
    }


}
