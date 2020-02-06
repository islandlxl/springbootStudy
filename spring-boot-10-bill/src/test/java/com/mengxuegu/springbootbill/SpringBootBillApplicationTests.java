package com.mengxuegu.springbootbill;

import com.mengxuegu.springbootbill.entities.Bill;
import com.mengxuegu.springbootbill.entities.BillProvider;
import com.mengxuegu.springbootbill.entities.Provider;
import com.mengxuegu.springbootbill.entities.User;
import com.mengxuegu.springbootbill.mapper.BillMapper;
import com.mengxuegu.springbootbill.mapper.ProviderMapper;
import com.mengxuegu.springbootbill.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBillApplicationTests {

    @Autowired
    ProviderMapper providerMapper;

    @Autowired
    BillMapper billMapper;

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<Provider> providers = providerMapper.getProviders(null);
        System.out.println(providers.get(0));
        Provider provider = providerMapper.getProviderByPid(1);
        System.out.println(provider);
        provider.setProviderCode("P_11111");
        int size = providerMapper.updateProvider(provider);
        System.out.println(size);
        providerMapper.addProvider(new Provider(null, "PR-AA", "梦学谷供应商111","小张", "18888666981", "深圳软件园", "0911-0123456", "品质A"));
        providerMapper.deleteProviderByPid(5);


    }

    @Test
    public void testBill(){

        List<BillProvider> bills = billMapper.getBills(null);

        System.out.println(bills.get(0));

        Bill billProvider = billMapper.getBillById(4);
        System.out.println(billProvider);

        billProvider.setBillName("cn域名..");

        billMapper.updateBill(billProvider);
        System.out.println(billProvider);

        int i = billMapper.addBill(new Bill(3001, "Bi-AA11", "粮油aaa", "斤", 80, 480.8,
                new Provider(null, "PR-BB", "梦学谷供应商222", "小李", "18888666982", "深圳软件园",
                        "0911-0123453", "品质B"), 1));
        System.out.println(i);

        int row = billMapper.deleteBillByBid(6);

        System.out.println(row);

    }

    @Test
    public void testUser(){

//        List<User> users = userMapper.getUsers(null);
//        for (User user:users) {
//            System.out.println(user);
//        }
//        User user = userMapper.getUserById(2);
//
//        System.out.println(user);
//
//        user.setRealName("张学良");
//
//        int i = userMapper.updateUser(user);
//        System.out.println(i);
//      //  Integer id, String username, String realName, String password, Integer gender, Integer userType
        int row = userMapper.addUser(new User(3, "lxl", "龙学良", "123", 2, 1));

        System.out.println(row);
//
//        int row2 = userMapper.deleteUserByid(3);
//
//        System.out.println(row2);
    }

}

