package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    Payment queryPaymentById(@Param("id") Long id);
    int addPayment(Payment payment);
}
