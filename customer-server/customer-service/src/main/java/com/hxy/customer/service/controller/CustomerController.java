package com.hxy.customer.service.controller;

import com.hxy.customer.entity.OrderInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/orderNotify")
    public String orderNotify(@RequestBody OrderInfo orderInfo) {
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(orderInfo);
        return "customer-service: order create success.";
    }

}
