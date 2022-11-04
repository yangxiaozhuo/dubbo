package com.yxz.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@EnableDubbo
@SpringBootApplication
public class UserServiceProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(UserServiceProviderApplication.class, args);
    }
}
