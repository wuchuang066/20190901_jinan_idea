package com.zpark.service;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Goods;

public interface GoodsService {
    /**
     * 功能描述 根据条件查询指定页数的商品信息
     */
    PageInfo<Goods> queryPages(Goods goods, Integer pageNumber);

    /**
     * 功能描述 修改指定编号的商品信息
     *
     * @param goods
     * @return java.lang.Integer
     * @author wuc
     * @date 2019/12/3 15:21
     */
    Integer updateConditions(Goods goods);

    Integer insert(Goods goods);

    Goods selectByGoodsId(Integer goodsId);
}
