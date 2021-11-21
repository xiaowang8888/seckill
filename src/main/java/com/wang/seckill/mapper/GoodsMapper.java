package com.wang.seckill.mapper;

import com.wang.seckill.pojo.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangmengcheng
 * @since 2021-11-05
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    //获取商品列表
    List<GoodsVo> findGoodsVo();

    //根据商品ID查找商品
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
