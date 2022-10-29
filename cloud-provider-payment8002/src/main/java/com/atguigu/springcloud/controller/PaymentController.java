package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.dao.pojo.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private  String serverPort;

    @GetMapping("get/{id}")
    public Result queryPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.queryPaymentById(id);
        log.info("查询结果->" + payment);
        if (payment != null) {
            return new Result(200,"查询成功！, serverPort -> " + serverPort,payment);
        } else {
            return new Result(444,"查询失败！",null);
        }
    }

    @PostMapping("add")
    public Result addPayment(@RequestBody Payment payment) {
        int result = paymentService.addPayment(payment);
        log.info("插入结果->" + result);
        if (result > 0) {
            return new Result(200,"添加成功！, serverPort -> " + serverPort,result);
        } else {
            return new Result(444,"添加失败->" + result,null);
        }
    }
}
