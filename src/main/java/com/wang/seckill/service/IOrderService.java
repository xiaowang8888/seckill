package com.wang.seckill.service;

import com.wang.seckill.pojo.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.seckill.pojo.User;
import com.wang.seckill.vo.GoodsVo;
import com.wang.seckill.vo.OrderDetailVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangmengcheng
 * @since 2021-11-05
 */
public interface IOrderService extends IService<Order> {

    //秒杀
    Order seckill(User user, GoodsVo goods);

    //订单详情
    OrderDetailVo detail(Long orderId);

    //获取秒杀地址
    String createPath(User user, Long goodsId);

    //验证秒杀地址
    boolean checkPath(User user, Long goodsId, String path);

    //校验验证码
    boolean checkCaptcha(User user, Long goodsId, String captcha);
}
