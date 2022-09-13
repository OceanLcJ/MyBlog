package com.liucj.springcloud.service;

import com.liucj.springcloud.model.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    Payment queryById(@Param("id")long id);
}
