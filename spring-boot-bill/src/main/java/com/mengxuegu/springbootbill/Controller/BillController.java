package com.mengxuegu.springbootbill.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
@project:com.mengxuegu.springbootbill.Controller
@Title:BillController
@Auther:lxl
@create:2018/12/24,10:44
*/
@Controller
public class BillController {


    @GetMapping("/bill")
    public String billList(){

        int i=1/0;

        return "bill/list";
    }

}
