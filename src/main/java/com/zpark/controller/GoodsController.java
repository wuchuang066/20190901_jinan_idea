package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Goods;
import com.zpark.service.GoodsService;
import com.zpark.utils.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName GoodsController
 * @Description TODO
 * @Author wuc
 * @Date 2019/12/2 13:43
 * @Version 1.0
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    // spring 推荐使用构造器注入
    // 使用@Autowired: 对于IOC容器以外的环境，除了使用反射来提供它需要的依赖之外，无法复用该实现类。而且将一直是个潜在的隐患，
    // 因为你不调用将一直无法发现NullPointException的存在
    // 使用field注入可能会导致循环依赖
    private GoodsService goodsService;

    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    /**
     * 功能描述 分页查询商品信息
     *
     * @param pageNumber
     * @param goods
     * @return com.zpark.utils.ResultObject
     * @author wuc
     * @date 2019/12/2 13:48
     */
    @RequestMapping("queryGoods/{pageNumber}")
    public ResultObject queryGoodsPages(@PathVariable Integer pageNumber, Goods goods) {
        ResultObject result = new ResultObject();
        try {
            PageInfo<Goods> goodsPageInfo = this.goodsService.queryPages(goods, pageNumber);
            List<Goods> list = goodsPageInfo.getList();
            if (list != null && list.size() > 0) {
                Map<String, Object> map = new HashMap<>();
                map.put("goodsListPages", goodsPageInfo);
                result.setResultData(map);
                result.setCode(0);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        result.setCode(1);
        result.setMessage("查询商品信息失败！");
        return result;
    }

    /**
     * 功能描述 修改指定编号的商品信息
     *
     * @param goods
     * @return com.zpark.utils.ResultObject
     * @author wuc
     * @date 2019/12/3 15:28
     */
    @RequestMapping("update")
    public ResultObject updateConditions(Goods goods) {
        ResultObject result = new ResultObject();
        try {
            Integer integer = this.goodsService.updateConditions(goods);
            if (integer > 0) {
                result.setCode(0);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        result.setCode(1);
        result.setMessage("修改商品信息失败！");
        return result;
    }

    @RequestMapping("insert")
    public ResultObject insert(Goods goods){
        ResultObject result = new ResultObject();
        try {
            Integer integer = this.goodsService.insert(goods);
            if (integer > 0) {
                result.setCode(0);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        result.setCode(1);
        result.setMessage("添加商品信息失败！");
        return result;
    }
}
