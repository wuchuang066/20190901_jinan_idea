package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Orders;
import com.zpark.service.OrdersService;
import com.zpark.utils.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName OrdersController
 * @Description TODO
 * @Author wuc
 * @Date 2019/12/5 16:07
 * @Version 1.0
 */
@RestController
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping("select/{pageNumber}")
    public ResultObject selectPages(Orders orders,@PathVariable Integer pageNumber){
        ResultObject result = new ResultObject();
        try {
            PageInfo<Orders> ordersPageInfo = this.ordersService.selectPages(orders, pageNumber);
            if (ordersPageInfo.getSize()  > 0) {
                result.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("pages", ordersPageInfo);
                result.setResultData(map);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage(e.getMessage());
        }
        result.setCode(1);
        result.setMessage("查询订单信息失败！");
        return result;
    }
}
