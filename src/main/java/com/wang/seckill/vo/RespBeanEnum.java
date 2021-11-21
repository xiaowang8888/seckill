package com.wang.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 返回状态枚举
 *
 * @author zhoubin
 * @since 1.0.0
 */
@ToString
@Getter
@AllArgsConstructor
public enum RespBeanEnum {
    //通用状态码
    SUCCESS(200,"success"),
    ERROR(500,"服务端异常"),
    //登录模块5002xx
    SESSION_ERROR(500210,"session不存在或者已经失效"),
    LOGINVO_ERROR(500211,"用户名或者密码错误"),
    MOBILE_ERROR(500212,"手机号码格式错误"),
    BIND_ERROR(500213,"参数校验异常"),
    //秒杀模块5005xx
    EMPTY_STOCK(500500,"库存不足"),
    REPEATE_ERROR(500501,"该商品没人限购一件"),
    REQUEST_ILLEGAL(500502,"请求非法"),
    ERROR_CAPTCHA(500503,"验证码错误"),
    ACCESS_LIMIT_REACHED(500504,"访问过于频繁，请稍后再试"),
    //订单不存在
    ORDER_NOT_EXIST(500600,"订单不存在");

    private final Integer code;
    private final String message;

}
