package com.yxz.gmalinterface.service;

import com.yxz.gmalinterface.bean.UserAddress;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
