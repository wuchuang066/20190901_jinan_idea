package com.zpark.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.entity.OrderDetail;
import com.zpark.mapper.OrderDetailMapper;
import com.zpark.service.OrderDetailService;
import com.zpark.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName OrderDetailServiceImpl
 * @Description TODO
 * @Author
 * @Date 2019/12/9 15:16
 * @Version 1.0
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailMapper orderDetailMapper;

    @Autowired
    public void setOrderDetailMapper(OrderDetailMapper orderDetailMapper) {
        this.orderDetailMapper = orderDetailMapper;
    }

    /**
     * 功能描述: 查询订单明细信息
     *
     * @param orderId
     * @param pageNumber
     * @return com.github.pagehelper.PageInfo<com.zpark.entity.OrderDetail>
     * @author
     * @date 2019/12/9 15:27
     */
    @Override
    public PageInfo<OrderDetail> queryByOrderId(Integer orderId, Integer pageNumber) {
        PageHelper.startPage(pageNumber, Integer.parseInt(Page.getName(6)));
        List<OrderDetail> list = this.orderDetailMapper.selectPages(orderId);
        return new PageInfo<>(list);
    }
}
