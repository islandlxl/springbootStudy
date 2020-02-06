package com.mengxuegu.springbootbill.Controller;

import com.mengxuegu.springbootbill.entities.User;
import com.mengxuegu.springbootbill.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/*
@project:com.mengxuegu.springbootbill.Controller
@Title:UserController
@Auther:lxl
@create:2019/1/20,11:03
*/
@Controller
public class UserController  {

    @Autowired
    UserMapper userMapper;

    Logger logger = LoggerFactory.getLogger(getClass());
//    @InitBinder
//    public void intDate(WebDataBinder dataBinder){
//        dataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"), "birthday"); }
//查询用户列表
    @GetMapping("users")
    public String userList(User user,Map<String,Object> map){

        logger.info("用户信息查询");
        List<User> users = userMapper.getUsers(user);

        map.put("users",users);

        return "user/list";
    }
//查询单个用户
    @GetMapping("user/{id}")
    public String getUserByid(@PathVariable("id") Integer id, @RequestParam(value = "type",defaultValue = "view") String type,
                              Map<String,Object> map){
        logger.info("查询单个"+id+"用户的信息");

        User user = userMapper.getUserById(id);

        map.put("user",user);

        return "user/"+type;
    }
//修改单个用户
    @PutMapping("/user")
    public String update(User user){
        logger.info("修改单个用户"+user);
        int i = userMapper.updateUser(user);
        return "redirect:/users";
    }
//添加单个用户
    @GetMapping("/user")
    public String toaddPage(){

        return "user/add";
    }
//添加成功返回到列表页面
    @PostMapping("/user")
    public String add(User user){
       logger.info("添加成功的页面"+user);
        int i = userMapper.addUser(user);

        return "redirect:/users";
    }
//删除单个用户
    @DeleteMapping("user/{id}")
    public String delete(@PathVariable("id") Integer id){

        logger.info("删除单个用户"+id);
        int i = userMapper.deleteUserByid(id);
        return "redirect:/users";

    }
//前往修改密码页面
    @GetMapping("/user/pwd")
    public String topwdUpdatePage(){
        return "/main/password";
    }
//校验密码是否正确
    @ResponseBody
    @GetMapping("/user/pwd/{oldPwd}")
    public Boolean checkPwd(@PathVariable("oldPwd") String oldPwd,
                            HttpSession session){

        logger.info("输入原先的旧密码"+oldPwd);

        User user = (User) session.getAttribute("loginUser");

        if (user.getPassword().equals(oldPwd)){
            return true;
        }
        return false;
    }
//修改密码
    @PostMapping("/user/pwd")
    public String updatePwd(HttpSession session,String password){

        logger.info("修改密码"+password);
        //获取session中的登录信息
        User user =(User) session.getAttribute("loginUser");

        user.setPassword(password);
        userMapper.updateUser(user);

        return "redirect:/loginout";
    }
}
