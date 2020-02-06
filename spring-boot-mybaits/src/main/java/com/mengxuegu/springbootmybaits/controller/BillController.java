package com.mengxuegu.springbootmybaits.controller;

import com.mengxuegu.springbootmybaits.entities.Bill;
import com.mengxuegu.springbootmybaits.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@project:com.mengxuegu.springbootmybaits.controller
@Title:BillController
@Auther:lxl
@create:2018/12/31,13:18
*/
@Controller
public class BillController {

    @Autowired
    BillMapper billMapper;

    @ResponseBody
    @GetMapping("/bill/{bid}")
    public Bill getBill(@PathVariable("bid") Integer bid){

        return billMapper.getBillById(bid);
    }

    @ResponseBody
    @GetMapping("/bill")
    public int addBill(Bill bill){

        int i = billMapper.insertBill(bill);
        return i;
    }


}
