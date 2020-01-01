package com.zpark.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private Integer userId;

    private String consigneeName;

    private String consigneeAddress;

    private String orderPhone;

    private Date orderDate;

    private Integer orderState;

    private String orderNote;

    private String groupDate;

    private Double groupPrice;

    private List<OrderDetail> orderDetailList;

    /**
     * 功能描述:用户信息
     */
    private Users users;

    /**
     * 功能描述 时间下限
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMin;

    /**
     * 功能描述 时间上限
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMax;

}