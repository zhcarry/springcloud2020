package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.vo.Result;

/**
 * @auther zzyy
 * @create 2020-02-25 15:32
 */
public class CustomerBlockHandler
{
    public static Result handlerException(BlockException exception) {
        return new Result(4444,"按客戶自定义,global handlerException----1",null);
    }
    public static Result handlerException2(BlockException exception) {
        return new Result(4444,"按客戶自定义,global handlerException----2",null);
    }
}
