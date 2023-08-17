package com.mengxuegu.springbootinit01.controller;

import com.mengxuegu.springbootinit01.dao.IslandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherService {

    @Autowired
    private  IslandDao islandDao;

    @Override
    public String toString() {
        return "OtherService{" +
                "islandDao=" + islandDao +
                '}';
    }


}
