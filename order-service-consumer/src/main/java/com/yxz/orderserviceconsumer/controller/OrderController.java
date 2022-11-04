package com.yxz.orderserviceconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yxz.gmalinterface.bean.UserAddress;
import com.yxz.orderserviceconsumer.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
	
	@Autowired
	private OrderServiceImpl orderServiceimpl;

	@ResponseBody
	@GetMapping("/init/{id}")
	public List<UserAddress> init(@PathVariable("id") String id) {
		return orderServiceimpl.initOrder(id);
	}

}
