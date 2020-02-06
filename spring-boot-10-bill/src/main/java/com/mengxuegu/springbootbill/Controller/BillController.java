package com.mengxuegu.springbootbill.Controller;

import com.mengxuegu.springbootbill.entities.Bill;
import com.mengxuegu.springbootbill.entities.BillProvider;
import com.mengxuegu.springbootbill.entities.Provider;
import com.mengxuegu.springbootbill.mapper.BillMapper;
import com.mengxuegu.springbootbill.mapper.ProviderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
@project:com.mengxuegu.springbootbill.Controller
@Title:BillController
@Auther:lxl
@create:2018/12/24,10:44
*/
@Controller
public class BillController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    BillMapper billMapper;
    @Autowired
    ProviderMapper providerMapper;

//    订单列表
    @GetMapping("/bills")
    public String billList(BillProvider billProvider, Map<String,Object> map){

        logger.info("账单列表查询："+billProvider);

        List<Provider> providers = providerMapper.getProviders(null);

        Collection<BillProvider> billProviders = billMapper.getBills(billProvider);

        map.put("providers",providers);
        map.put("billProviders",billProviders);

//        回显
        map.put("billName",billProvider.getBillName());
        map.put("pid",billProvider.getPid());
        map.put("pay",billProvider.getPay());
        return "bill/list";

    }

//  修改和查看详情
    @GetMapping("/bill/{bid}")
    public String detail(@PathVariable("bid") Integer bid, @RequestParam(value ="type",defaultValue = "view") String type
            ,Map<String,Object> map){

        BillProvider billProvider = billMapper.getBillById(bid);

        map.put("billProvider",billProvider);

        if("update".equals(type)){

            List<Provider> providers = providerMapper.getProviders(null);
            map.put("providers",providers);
        }

        return "bill/"+type;
    }
// 修改
    @ PutMapping("/bill")
    public String update(BillProvider billProvider){

        logger.info("修改"+billProvider.getBid()+"账单");

        int i = billMapper.updateBill(billProvider);

        return "redirect:/bills";
    }
//    去添加页面
    @GetMapping("/bill")
    public String addPage(Map<String,Object> map){

        map.put("providers",providerMapper.getProviders(null));
        return "bill/add";
    }
//    添加数据
    @PostMapping("/bill")
    public String addData(Bill bill){
        logger.info("正在添加"+bill+"账单数据");
        billMapper.addBill(bill);
        return "redirect:/bills";
    }
//    删除
    @DeleteMapping("/bill/{bid}")
    public String deleteBill(@PathVariable("bid") Integer bid, Map<String,Object> map){
        logger.info("根据选中的"+bid+"删除");
        int i = billMapper.deleteBillByBid(bid);
        return "redirect:/bills";
    }





}
