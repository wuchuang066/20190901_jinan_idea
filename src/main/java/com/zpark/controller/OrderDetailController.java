package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.OrderDetail;
import com.zpark.service.OrderDetailService;
import com.zpark.utils.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName OrderDetailController
 * @Description TODO
 * @Author
 * @Date 2019/12/9 15:31
 * @Version 1.0
 */
@RestController
@RequestMapping("orderDetail")
public class OrderDetailController {

    private OrderDetailService orderDetailService;

    @Autowired
    public void setOrderDetailService(OrderDetailService orderDetailService) {
        this.orderDetailService = orderDetailService;
    }

    /**
     * 功能描述 查询订单详细信息
     *
     * @param orderId
     * @param pageNumber
     * @return com.zpark.utils.ResultObject
     * @author
     * @date 2019/12/9 15:36
     */
    @RequestMapping("selectByOrderId/{pageNumber}")
    public ResultObject selectPages(@RequestParam("orderId") Integer orderId, @PathVariable Integer pageNumber) {
        ResultObject rs = new ResultObject();
        try {
            PageInfo<OrderDetail> pageInfo = this.orderDetailService.queryByOrderId(orderId, pageNumber);
            if (pageInfo.getSize() > 0) {
                rs.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("pages", pageInfo);
                rs.setResultData(map);
                return rs;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(1);
        rs.setMessage("查询订单详细信息失败！！");
        return rs;
    }

}
