package com.yxz.orderserviceconsumer.service.impl;

import com.yxz.gmalinterface.bean.UserAddress;
import com.yxz.gmalinterface.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;


public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * 传入的是远程代理对象
     * @param service
     */
    public UserServiceStub(UserService service) {
        this.userService = service;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        if (!StringUtils.isEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
