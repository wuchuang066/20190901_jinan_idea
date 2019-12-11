package com.zpark.service;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.OrderDetail;

public interface OrderDetailService {

   PageInfo<OrderDetail> queryByOrderId(Integer orderId,Integer pageNumber);
}
