package com.kanma.mapper;

import com.kanma.model.Orders;

import java.util.List;

/**
 * @ Desc   ：关联查询的映射接口
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/8 1:59
 */
public interface OrdersMapperCustom {
    //一对一查询
    List<Orders> findOrdersUserResultMap() throws Exception;
    //一对多查询
    List<Orders>  findOrdersAndOrderDetailResultMap()throws Exception;
}