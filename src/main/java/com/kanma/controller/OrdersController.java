package com.kanma.controller;

import com.kanma.model.Orders;
import com.kanma.service.OrdersService;
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
    private OrdersService ordersService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<Orders> findOrdersUser() {
        try {
            //List<Orders> resultMap = ordersService.findOrdersUserResultMap();
            return ordersService.findOrdersUserResultMap();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/orders/details", method = RequestMethod.GET)
    public List<Orders> findOrdersAndDetails() {
        try {
            return ordersService.findOrdersAndOrderDetailResultMap();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
