package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.pojo.Payment;
import com.atguigu.springcloud.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("payment/get/{id}")
    Result<Payment> queryPaymentById(@PathVariable("id") Long id);

    /*@GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();*/
}
