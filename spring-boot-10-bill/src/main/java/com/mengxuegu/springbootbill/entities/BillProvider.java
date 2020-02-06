package com.mengxuegu.springbootbill.entities;

/*
@project:com.mengxuegu.springbootbill.entities
@Title:BillProvider
@Auther:lxl
@create:2019/1/19,11:17
*/public class BillProvider extends Bill {

    private String providerName;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
