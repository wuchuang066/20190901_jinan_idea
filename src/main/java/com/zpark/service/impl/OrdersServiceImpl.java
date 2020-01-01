package com.zpark.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.entity.Orders;
import com.zpark.mapper.OrderDetailMapper;
import com.zpark.mapper.OrdersMapper;
import com.zpark.service.OrdersService;
import com.zpark.utils.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Resource
    private OrderDetailMapper orderDetailMapper;

    @Override
    public PageInfo<Orders> selectPages(Orders orders, Integer pageNumber) {
        // 如果时间上限晚于下限 则交换
        Date orderDateMax = orders.getOrderDateMax();
        Date orderDateMin = orders.getOrderDateMin();
        if (orderDateMax != null && orderDateMin != null) {
            if (orderDateMin.after(orderDateMax)) {
                orders.setOrderDateMax(orderDateMin);
                orders.setOrderDateMin(orderDateMax);
            }
        }
        PageHelper.startPage(pageNumber, Integer.parseInt(Page.getName(6)));
        List<Orders> list = this.ordersMapper.selectPages(orders);
        return new PageInfo<>(list);
    }

    /**
     * 功能描述  orders图表数据查询
     *
     * @param orders
     * @return java.util.List<com.zpark.entity.Orders>
     * @author
     * @date 2019/12/11 13:47
     */
    @Override
    public List<Orders> selectOrderGroup(Orders orders) {
        // 如果时间上限晚于下限 则交换
        Date orderDateMax = orders.getOrderDateMax();
        Date orderDateMin = orders.getOrderDateMin();
        if (orderDateMin.after(orderDateMax)) {
            orders.setOrderDateMax(orderDateMin);
            orders.setOrderDateMin(orderDateMax);
        }
        List<Orders> list = this.ordersMapper.selectGroup(orders);
        return list;
    }

    @Override
    //添加事务注释
    @Transactional
    public Integer insertOrderAndOrderDetail(Orders orders) {
        orders.setOrderDate(new Date());
        Integer integer = this.ordersMapper.insertOrder(orders);
        if (integer > 0) {
            Integer integer1 = this.orderDetailMapper.insertOrderDetail(orders);
            if (integer1 > 0) {
                return 1;
            }
        }
        return 0;
    }


}
