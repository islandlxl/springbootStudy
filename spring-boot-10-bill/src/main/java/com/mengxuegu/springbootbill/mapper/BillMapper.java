package com.mengxuegu.springbootbill.mapper;

import com.mengxuegu.springbootbill.entities.Bill;
import com.mengxuegu.springbootbill.entities.BillProvider;

import java.util.List;

/*
@project:com.mengxuegu.springbootbill.mapper
@Title:BillMapper
@Auther:lxl
@create:2019/1/19,11:18
*/public interface BillMapper {
    List<BillProvider>  getBills(Bill bIll);

    BillProvider  getBillById(Integer bid);

    int addBill(Bill bill);

    int updateBill(Bill bill);

    int deleteBillByBid(Integer bid);


}
