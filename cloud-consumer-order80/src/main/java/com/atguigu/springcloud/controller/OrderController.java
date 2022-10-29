package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.dao.pojo.Payment;
import com.atguigu.springcloud.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("consumer")
public class OrderController {
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("payment/add")
    public Result<Payment> addPayment(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/add",payment,Result.class);
    }

    @GetMapping("payment/get/{id}")
    public Result<Payment> queryPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id,Result.class);
    }
}
