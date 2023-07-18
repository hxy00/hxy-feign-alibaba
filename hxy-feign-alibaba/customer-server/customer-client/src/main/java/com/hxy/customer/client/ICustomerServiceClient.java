package com.hxy.customer.client;

import com.hxy.customer.client.impl.CustomerServiceClientFallback;
import com.hxy.customer.vo.OrderInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "customer-service", path = "/customer", fallback = CustomerServiceClientFallback.class)
public interface ICustomerServiceClient {

    @PostMapping("/orderNotify")
    String orderNotify(@RequestBody OrderInfoVo orderInfo);

}
