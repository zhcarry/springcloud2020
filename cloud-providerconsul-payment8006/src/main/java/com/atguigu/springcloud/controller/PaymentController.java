package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @auther zzyy
 * @create 2020-02-19 16:06
 */
@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("consul")
    public String paymentConsul()
    {
        return "springCloud with consul: "+serverPort+"\t   "+ UUID.randomUUID().toString();
    }
}
