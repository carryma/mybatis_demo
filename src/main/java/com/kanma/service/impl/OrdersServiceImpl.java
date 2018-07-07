package com.kanma.service.impl;

import com.kanma.mapper.OrdersMapperCustom;
import com.kanma.model.Orders;
import com.kanma.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Resource
    private OrdersMapperCustom ordersMapperCustom;

    @Override
    public List<Orders> findOrdersUserResultMap() throws Exception {
        return ordersMapperCustom.findOrdersUserResultMap();
    }
}
