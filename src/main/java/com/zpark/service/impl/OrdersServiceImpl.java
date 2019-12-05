package com.zpark.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.entity.Orders;
import com.zpark.mapper.OrdersMapper;
import com.zpark.service.OrdersService;
import com.zpark.utils.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrdersServiceImpl
 * @Description 订单信息service
 * @Author wuc
 * @Date 2019/12/5 15:42
 * @Version 1.0
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public PageInfo<Orders> selectPages(Orders orders, Integer pageNumber) {
        // 如果时间上限晚于下限 则交换
        Date orderDateMax = orders.getOrderDateMax();
        Date orderDateMin = orders.getOrderDateMin();
        if (orderDateMax != null && orderDateMin != null) {
            if (orderDateMin.after(orderDateMax) ) {
                orders.setOrderDateMax(orderDateMin);
                orders.setOrderDateMin(orderDateMax);
            }
        }
        PageHelper.startPage(pageNumber, Integer.parseInt(Page.getName(6)));
        List<Orders> list = this.ordersMapper.selectPages(orders);
        return new PageInfo<>(list);
    }
}
