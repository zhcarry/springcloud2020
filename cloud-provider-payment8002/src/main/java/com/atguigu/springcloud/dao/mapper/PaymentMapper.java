package com.atguigu.springcloud.dao.mapper;

import com.atguigu.springcloud.dao.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    Payment selectPaymentById(@Param("id") Long id);
    int insertPayment(Payment payment);
}
