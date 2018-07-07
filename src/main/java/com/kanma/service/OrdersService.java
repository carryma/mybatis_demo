package com.kanma.service;

import com.kanma.model.Orders;

import java.util.List;

/**
 * @ Desc   ：Orders Service 接口
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/8 2:44
 */
public interface OrdersService {
    List<Orders> findOrdersUserResultMap() throws Exception;
}
