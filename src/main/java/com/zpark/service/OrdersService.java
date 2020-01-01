package com.zpark.service;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Orders;

import java.util.List;

public interface OrdersService {
     PageInfo<Orders> selectPages(Orders orders, Integer pageNumber);

     List<Orders> selectOrderGroup(Orders orders);

     Integer insertOrderAndOrderDetail(Orders orders);
}
