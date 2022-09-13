package com.liucj.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class CommonResult<T> {

    private Integer code;//返回状态码
    private String  message;//返回是否调用成功
    private  T data; //返回的数据

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
