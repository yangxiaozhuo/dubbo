package com.yxz.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yxz.gmalinterface.bean.UserAddress;
import com.yxz.gmalinterface.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 1.将服务注册到注册中心
 *  1）导入dubbo依赖\zookeeper依赖 curator
 *  2）配置服务提供者
 *
 * 2.让消费者去注册中心订阅服务
 */
@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("3号被调用");
        UserAddress address1 = new UserAddress(1, "地址1", "1", "姓名1", "135123456", "Y");
        UserAddress address2 = new UserAddress(2, "地址2", "1", "姓名2", "135123456", "F");
        return Arrays.asList(address1,address2);
    }
}
