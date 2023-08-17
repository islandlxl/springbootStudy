package com.mengxuegu.springbootinit01.Service;

import com.mengxuegu.springbootinit01.dao.IslandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 证明Autowired是byName的
 */
public class IslandService {

    @Autowired
    private  IslandDao islandDao;

    @Override
    public String toString() {
        return "IslandService{" +
                "islandDao=" + islandDao +
                '}';
    }
}
