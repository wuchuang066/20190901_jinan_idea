package com.zpark.service;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Orders;

public interface OrdersService {
     PageInfo<Orders> selectPages(Orders orders,Integer pageNumber);
}
