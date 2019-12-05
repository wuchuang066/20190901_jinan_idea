package com.zpark.mapper;

import com.zpark.entity.Orders;

import java.util.List;

public interface OrdersMapper {
    // 连表查询时候不能使用通用mapper 否则会报错
    List<Orders> selectPages(Orders orders);
}