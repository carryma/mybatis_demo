package com.kanma.controller;

import com.kanma.model.Orders;
import com.kanma.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Desc   ：Orders Controller
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/8 3:03
 */

@RestController
public class OrdersController {
    @Autowired
    private OrdersServiceImpl ordersServiceImpl;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<Orders> findOrdersUser() {
        try {
            List<Orders> resultMap = ordersServiceImpl.findOrdersUserResultMap();
            return resultMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
