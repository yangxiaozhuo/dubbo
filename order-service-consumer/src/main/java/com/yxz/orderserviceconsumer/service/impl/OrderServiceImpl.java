package com.yxz.orderserviceconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yxz.gmalinterface.bean.UserAddress;
import com.yxz.gmalinterface.service.OrderService;
import com.yxz.gmalinterface.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    @Reference(timeout = 5000, loadbalance = "random")
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("init函数");

        //1.查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}
