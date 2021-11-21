package com.wang.seckill.service;

import com.wang.seckill.pojo.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangmengcheng
 * @since 2021-11-05
 */
public interface IGoodsService extends IService<Goods> {

    //获取商品列表
    List<GoodsVo> findGoodsVo();

    //根据商品ID查找商品
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
