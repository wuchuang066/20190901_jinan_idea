package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Orders;
import com.zpark.service.OrdersService;
import com.zpark.utils.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    /**
     * 功能描述  图表信息数据查询
     * @author
     * @date 2019/12/11 13:48
     * @param orders
     * @return com.zpark.utils.ResultObject
     */
    @GetMapping("selectGroup")
    public ResultObject selectGroup(Orders orders) {
        ResultObject rs = new ResultObject();
        try {
            List<Orders> ordersList = this.ordersService.selectOrderGroup(orders);
            if (ordersList != null && ordersList.size() > 0) {
                rs.setCode(0);
                // 声明两个集合用来保存 x轴 y轴数据
                List<String> xData = new ArrayList<>();
                List<Double> yData = new ArrayList<>();
                for (Orders order : ordersList) {
                    xData.add(order.getGroupDate());
                    yData.add(order.getGroupPrice());
                }
                Map<String, Object> map = new HashMap<>();
                map.put("xData", xData);
                map.put("yData", yData);
                rs.setResultData(map);
                return rs;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(0);
        rs.setMessage("订单表格数组信息查询失败！");
        return rs;
    }
}
