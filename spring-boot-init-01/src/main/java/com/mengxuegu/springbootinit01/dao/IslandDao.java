package com.mengxuegu.springbootinit01.dao;

public class IslandDao {
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "IslandDao{" +
                "flag=" + flag +
                '}';
    }
}
