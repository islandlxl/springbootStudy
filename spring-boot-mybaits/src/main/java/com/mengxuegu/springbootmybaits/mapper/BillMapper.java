package com.mengxuegu.springbootmybaits.mapper;

import com.mengxuegu.springbootmybaits.entities.Bill;

/*
@project:com.mengxuegu.springbootmybaits.mapper
@Title:BillMapper
@Auther:lxl
@create:2018/12/31,11:45
*/
public interface BillMapper {

    Bill getBillById(Integer bid);

    int insertBill(Bill bill);

}
