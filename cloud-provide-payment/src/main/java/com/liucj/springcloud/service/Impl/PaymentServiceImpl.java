package com.liucj.springcloud.service.Impl;

import com.liucj.springcloud.dao.PaymentMapper;
import com.liucj.springcloud.model.Payment;
import com.liucj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentMapper paymentMapper;

    @Override
    public Payment queryById(long id) {
        return paymentMapper.queryById(id);
    }
}
