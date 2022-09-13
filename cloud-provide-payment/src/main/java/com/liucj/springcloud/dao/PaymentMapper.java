package com.liucj.springcloud.dao;

import com.liucj.springcloud.model.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PaymentMapper {

    Payment queryById(@Param("id")long id);
}
