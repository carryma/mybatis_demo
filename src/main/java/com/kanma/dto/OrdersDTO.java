package com.kanma.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kanma.model.Orders;

import java.util.Date;

/**
 * @ Desc   ：Orders 数据传输对象
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/14 1:08
 */
/*
    SELECT
        orders.*,
        user.username,
        user.sex,
        user.address,
        orderdetail.id orderdetail_id,
        orderdetail.items_id,
        orderdetail.items_num,
        orderdetail.orders_id
    FROM
        orders,
        user,
        orderdetail
    WHERE orderdetail.orders_id=orders.id AND orders.user_id = user.id
*/
public class OrdersDTO {
    private Integer id;
    private Integer userId;
    private String number;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;
    private String note;
    private String username;
    private String sex;
    private String address;
    private String orderdetailId;
    private String itemsId;
    private String itemsNum;
    private String ordersId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderdetailId() {
        return orderdetailId;
    }

    public void setOrderdetailId(String orderdetailId) {
        this.orderdetailId = orderdetailId;
    }

    public String getItemsId() {
        return itemsId;
    }

    public void setItemsId(String itemsId) {
        this.itemsId = itemsId;
    }

    public String getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(String itemsNum) {
        this.itemsNum = itemsNum;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }


}
