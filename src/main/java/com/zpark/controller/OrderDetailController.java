package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.OrderDetail;
import com.zpark.service.OrderDetailService;
import com.zpark.utils.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName OrderDetailController
 * @Description TODO
 * @Author
 * @Date 2019/12/9 15:31
 * @Version 1.0
 */
@RestController
@RequestMapping("orderDetail")
public class OrderDetailController {

    @Autowired
    private RedisTemplate redisTemplate;

    private OrderDetailService orderDetailService;

    @Autowired
    public void setOrderDetailService(OrderDetailService orderDetailService) {
        this.orderDetailService = orderDetailService;
    }

    /**
     * 功能描述 查询订单详细信息
     *
     * @param orderId
     * @param pageNumber
     * @return com.zpark.utils.ResultObject
     * @author
     * @date 2019/12/9 15:36
     */
    @RequestMapping("selectByOrderId/{pageNumber}")
    public ResultObject selectPages(@RequestParam("orderId") Integer orderId, @PathVariable Integer pageNumber) {
        ResultObject rs = new ResultObject();
        try {
            PageInfo<OrderDetail> pageInfo = this.orderDetailService.queryByOrderId(orderId, pageNumber);
            if (pageInfo.getSize() > 0) {
                rs.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("pages", pageInfo);
                rs.setResultData(map);
                return rs;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(1);
        rs.setMessage("查询订单详细信息失败！！");
        return rs;
    }

    /**
     * 功能描述 向session中添加商品明细信息
     *
     * @param orderDetail
     * @return com.zpark.utils.ResultObject
     * @author
     * @date 2019/12/18 15:28
     */
    @RequestMapping("addShopcart")
    public ResultObject addShopcart(OrderDetail orderDetail, @RequestParam Integer userId) {
        ResultObject rs = new ResultObject();
        try {
            // 操作redis里面的value
            ValueOperations valueOperations = this.redisTemplate.opsForValue();
            //创建一个key
            String key = "user" + userId;
            List<OrderDetail> shopcart = (List<OrderDetail>) valueOperations.get(key);
            if (shopcart == null || shopcart.size() == 0) {
                // 当前用户没有购物车
                shopcart = new ArrayList<>();
            }
            // 判断购物车中是否存在之前买过的商品
            int index = shopcart.indexOf(orderDetail);
            if (index == -1) {
                //不存在之前购买过的商品
                shopcart.add(orderDetail);
            } else {
                //获取第index的订单明细信息
                OrderDetail orderDetail1 = shopcart.get(index);
                // 获得原来订单明细的数量
                Integer dealNumber = orderDetail1.getDealNumber();
                // 将要购买的数量
                Integer dealNumber1 = orderDetail.getDealNumber();
                int sumNum = dealNumber + dealNumber1;
                // 重新设置购买商品的数量
                orderDetail.setDealNumber(sumNum);
                shopcart.set(index, orderDetail);
            }
            // 将购物车以指定key重新放入redis中
            valueOperations.set(key, shopcart);
            rs.setCode(0);
//            Map<String, Object> map = new HashMap<>();
//            map.put("shopcart", shopcart);
//            rs.setResultData(map);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(1);
        rs.setMessage("添加购物车失败！");
        return rs;
    }

    /**
     * 功能描述 根据用户id查询购物车信息
     *
     * @param userId
     * @return com.zpark.utils.ResultObject
     * @author
     * @date 2019/12/19 15:10
     */
    @GetMapping("selectShopCart/{userId}")
    public ResultObject selectShopCart(@PathVariable Integer userId) {
        ResultObject rs = new ResultObject();
        try {
            ValueOperations valueOperations = this.redisTemplate.opsForValue();
            String key = "user" + userId;
            List<OrderDetail> shopcart = (List<OrderDetail>) valueOperations.get(key);
            Map<String, Object> map = new HashMap<>();
            rs.setCode(0);
            map.put("shopcart", shopcart);
            rs.setResultData(map);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(1);
        rs.setMessage("购物车信息获取失败！");
        return rs;
    }
}
