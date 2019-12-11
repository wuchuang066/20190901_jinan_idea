package com.zpark.mapper;

import com.zpark.entity.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {
//    int deleteByPrimaryKey(Integer orderDetailId);
//
//    int insert(OrderDetail record);
//
//    int insertSelective(OrderDetail record);
//
//    OrderDetail selectByPrimaryKey(Integer orderDetailId);
//
//    int updateByPrimaryKeySelective(OrderDetail record);
//
//    int updateByPrimaryKey(OrderDetail record);

    List<OrderDetail> selectPages(Integer orderId);
}