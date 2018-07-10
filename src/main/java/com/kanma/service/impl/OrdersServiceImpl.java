package com.kanma.service.impl;

import com.kanma.mapper.OrdersMapperCustom;
import com.kanma.model.Orders;
import com.kanma.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ Desc   ：Orders Service 实现类
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/8 2:50
 */
@Service(value = "orderService")
public class OrdersServiceImpl implements OrdersService {
    /*
     * @Resource默认按照名称方式进行bean匹配，@Autowired默认按照类型方式进行bean匹配
     * @Resource(import javax.annotation.Resource;)是J2EE的注解，
     * @Autowired( import org.springframework.beans.factory.annotation.Autowired;)是Spring的注解
     */
    @Resource
    private OrdersMapperCustom ordersMapperCustom;

    @Override
    public List<Orders> findOrdersUserResultMap() throws Exception {
        return ordersMapperCustom.findOrdersUserResultMap();
    }

    @Override
    public List<Orders> findOrdersAndOrderDetailResultMap() throws Exception {
        return ordersMapperCustom.findOrdersAndOrderDetailResultMap();
    }
}
