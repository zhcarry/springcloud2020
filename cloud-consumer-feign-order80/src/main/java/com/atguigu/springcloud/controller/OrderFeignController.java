package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.dao.pojo.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import com.atguigu.springcloud.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public Result<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.queryPaymentById(id);
    }

    /*@GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }*/
}
