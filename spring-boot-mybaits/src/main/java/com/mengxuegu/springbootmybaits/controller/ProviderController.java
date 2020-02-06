package com.mengxuegu.springbootmybaits.controller;

import com.mengxuegu.springbootmybaits.entities.Provider;
import com.mengxuegu.springbootmybaits.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@project:com.mengxuegu.springbootmybaits.controller
@Title:ProviderController
@Auther:lxl
@create:2018/12/29,13:10
*/
@Controller
public class ProviderController {

    @Autowired
    ProviderMapper providerMapper;

    @ResponseBody
    @GetMapping("/provider/{pid}")
    public Provider getProvider(@PathVariable("pid") Integer pid){

        Provider provider=providerMapper.getProviderById(pid);

        return provider;
    }

    @ResponseBody
    @GetMapping("/provider")
    public int addProvider(Provider provider){

        int count = providerMapper.addProvider(provider);

        return count;
    }

}
