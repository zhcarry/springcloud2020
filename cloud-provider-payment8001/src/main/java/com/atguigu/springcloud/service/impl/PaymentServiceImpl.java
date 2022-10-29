package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.mapper.PaymentMapper;
import com.atguigu.springcloud.dao.pojo.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Payment queryPaymentById(Long id) {
        return paymentMapper.selectPaymentById(id);
    }

    @Override
    public int addPayment(Payment payment) {
        return paymentMapper.insertPayment(payment);
    }
}
