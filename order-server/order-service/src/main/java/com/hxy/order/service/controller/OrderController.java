package com.hxy.order.service.controller;

import com.hxy.customer.client.ICustomerServiceClient;
import com.hxy.customer.vo.OrderInfoVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private ICustomerServiceClient iCustomerServiceClient;

    @GetMapping("/create")
    public String create() {
        OrderInfoVo orderInfo = new OrderInfoVo();
        orderInfo.setOrderNo("O2023050517350001");
        orderInfo.setOrderAmt(new BigDecimal(1200));
        String result = iCustomerServiceClient.orderNotify(orderInfo);
        System.out.println("result = " + result);
        return result;
    }
}
