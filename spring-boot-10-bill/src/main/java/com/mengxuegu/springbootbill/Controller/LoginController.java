package com.mengxuegu.springbootbill.Controller;

import com.mengxuegu.springbootbill.entities.User;
import com.mengxuegu.springbootbill.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UserMapper userMapper;


    @PostMapping("/login")
    public String login(HttpSession session
             , @RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map){

        if (!StringUtils.isEmpty(username)&& !StringUtils.isEmpty(password)){
//查询用户是否存在
            User user = userMapper.getUserByUsername(username);

            if (user!=null&&user.getPassword().equals(password)){

                session.setAttribute("loginUser",user);
                return "redirect:main.html";
            }
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
