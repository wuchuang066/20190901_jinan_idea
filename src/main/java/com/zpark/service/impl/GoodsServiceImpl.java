package com.zpark.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.entity.Goods;
import com.zpark.mapper.GoodsMapper;
import com.zpark.service.GoodsService;
import com.zpark.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName GoodsServiceImpl
 * @Description TODO
 * @Author wuc
 * @Date 2019/12/2 11:22
 * @Version 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 功能描述 根据条件查询指定页数的商品信息
     *
     * @param goods
     * @param pageNumber
     */
    @Override
    public PageInfo<Goods> queryPages(Goods goods, Integer pageNumber) {
        Double priceMin = goods.getPriceMin();
        if (priceMin == null) {
            goods.setPriceMin(0d);
        }
        Double priceMax = goods.getPriceMax();
        if (priceMax == null) {
            goods.setPriceMax(0d);
        }
        // 如果最高价小于最低价 进行交换
        if (priceMin != null && priceMax != null) {
            if (priceMin > priceMax) {
                goods.setPriceMax(priceMin);
                goods.setPriceMin(priceMax);
            }
        }
        PageHelper.startPage(pageNumber, Integer.parseInt(Page.getName(12)));
        List<Goods> goodsList = this.goodsMapper.selectPages(goods);
        return new PageInfo<>(goodsList);
    }

    /**
     * 功能描述 修改指定编号的商品信息
     *
     * @param goods
     * @return java.lang.Integer
     * @author wuc
     * @date 2019/12/3 15:21
     */
    @Override
    public Integer updateConditions(Goods goods) {
        return this.goodsMapper.updateByPrimaryKeySelective(goods);
    }

    /**
     * 功能描述: 插入商品信息
     *
     * @param goods
     * @return java.lang.Integer
     * @author wuc
     * @date 2019/12/5 19:02
     */
    @Override
    public Integer insert(Goods goods) {
        return this.goodsMapper.insert(goods);
    }

    /**
     * 功能描述 根据主键查询商品信息
     * @author
     * @date 2019/12/18 10:28
     * @param goodsId
     * @return com.zpark.entity.Goods
     */
    @Override
    public Goods selectByGoodsId(Integer goodsId) {
        return this.goodsMapper.selectByPrimaryKey(goodsId);
    }
}
