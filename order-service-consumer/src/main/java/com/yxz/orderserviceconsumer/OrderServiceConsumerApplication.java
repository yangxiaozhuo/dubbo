package com.yxz.orderserviceconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.yxz.gmalinterface.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@EnableDubbo
@SpringBootApplication
public class OrderServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceConsumerApplication.class, args);
    }
}
