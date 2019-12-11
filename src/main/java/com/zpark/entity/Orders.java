package com.zpark.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

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

    public String getGroupDate() {
        return groupDate;
    }

    public void setGroupDate(String groupDate) {
        this.groupDate = groupDate;
    }

    public Double getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(Double groupPrice) {
        this.groupPrice = groupPrice;
    }

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

    public Date getOrderDateMin() {
        return orderDateMin;
    }

    public void setOrderDateMin(Date orderDateMin) {
        this.orderDateMin = orderDateMin;
    }

    public Date getOrderDateMax() {
        return orderDateMax;
    }

    public void setOrderDateMax(Date orderDateMax) {
        this.orderDateMax = orderDateMax;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone == null ? null : orderPhone.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote == null ? null : orderNote.trim();
    }
}