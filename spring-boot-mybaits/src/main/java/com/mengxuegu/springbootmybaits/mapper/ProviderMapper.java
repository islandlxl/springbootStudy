package com.mengxuegu.springbootmybaits.mapper;

import com.mengxuegu.springbootmybaits.entities.Provider;
import org.apache.ibatis.annotations.*;

/*
@project:com.mengxuegu.springbootmybaits.mapper
@Title:ProviderMapper
@Auther:lxl
@create:2018/12/29,12:41
*/
//@Mapper//这是操作数据的mapper
public interface ProviderMapper {


    @Select("select * from provider where pid=#{pid}")
    Provider getProviderById(Integer id);
//userGeneratedKey是否使用自增主键，keyProperty指定实体类中哪个属性封装主键
    @Options(useGeneratedKeys = true,keyProperty = "pid")
    @Insert("insert into provider(providerName) values(#{providerName})")
    int addProvider(Provider provider);
//删除
    @Delete("delete from provider where pid=#{pid}")
    int deleteProviderById(Integer pid);
//修改
    @Update("update provider set providerName=#{providerName} where pid=#{pid}")
    int updateProvider(Provider provider);





}
