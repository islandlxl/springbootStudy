package com.mengxuegu.springbootbill.mapper;


import com.mengxuegu.springbootbill.entities.Provider;
import com.sun.tracing.ProviderName;

import java.util.List;

/*
@project:com.mengxuegu.springbootbill.mapper
@Title:ProviderMapper
@Auther:lxl
@create:2019/1/18,11:48
*/
//供应商管理
public interface ProviderMapper {

    List<Provider> getProviders(Provider provider);
    Provider getProviderByPid(Integer pid);
    int addProvider(Provider provider);
    int deleteProviderByPid(Integer pid);
    int updateProvider(Provider provider);


}
