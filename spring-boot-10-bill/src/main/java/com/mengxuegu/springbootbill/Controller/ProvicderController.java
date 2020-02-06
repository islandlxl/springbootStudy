package com.mengxuegu.springbootbill.Controller;

import com.mengxuegu.springbootbill.entities.Provider;
import com.mengxuegu.springbootbill.mapper.ProviderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

/*
@project:com.mengxuegu.springbootbill.Controller
@Title:ProvicderController
@Auther:lxl
@create:2018/12/21,19:55
*/
@Controller
public class ProvicderController {

    Logger logger= LoggerFactory.getLogger(getClass());



    @Autowired
    ProviderMapper providerMapper;

    //@RequestMapping("list")
    @GetMapping("/providers")
    public String list(Provider provider,
                       Map<String,Object> map){


        logger.info("供应商列表查询：providerName:"+provider);

          Collection<Provider> providers=  providerMapper.getProviders(provider);

          map.put("providers",providers);
         // map.put("providerName",provider.getProviderName());

        return "/provider/list";
    }

    /**
     *
     * @param type
     * @param pid
     * @param map
     * @return
     */
//    供应商的查询单个供应商详情
    @GetMapping("provider/{pid}")
    public String detail(@RequestParam(value = "type",defaultValue = "view") String type,
                         @PathVariable("pid") Integer pid,Map<String,Object> map){

        logger.info("查询"+pid+"的供应商的详细信息");
       Provider provider= providerMapper.getProviderByPid(pid);
       map.put("provider",provider);
       return "/provider/"+type;
    }
//  修改单个供应商
    @PutMapping("/provider")
    public String update(Provider provider){

        logger.info("修改供应商。。"+provider);
       providerMapper.updateProvider(provider);

        return "redirect:providers";
    }
//添加单个商品，前往添加的頁面
    @GetMapping("/provider")
    public String addPage(){
        return "provider/add";
    }
//添加单个供应商
    @PostMapping("/provider")
    public String addProvider(Provider provider){

//        添加供应商信息
        logger.info("添加供应商信息："+provider);

       providerMapper.addProvider(provider);

        return "redirect:/providers";
    }

    @DeleteMapping("provider/{pid}")
    public String deleteProvider(@PathVariable("pid") Integer pid){

        logger.info("删除单个供应商"+pid);

        providerMapper.deleteProviderByPid(pid);


        return "redirect:/providers";

    }

}
