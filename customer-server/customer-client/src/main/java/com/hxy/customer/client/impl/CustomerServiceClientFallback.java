package com.hxy.customer.client.impl;

import com.hxy.customer.client.ICustomerServiceClient;
import com.hxy.customer.vo.OrderInfoVo;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceClientFallback implements ICustomerServiceClient {

    @Override
    public String orderNotify(OrderInfoVo orderInfo) {
        return "服务降级了。";
    }
}
