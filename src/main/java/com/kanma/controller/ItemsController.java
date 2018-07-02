package com.kanma.controller;

import com.kanma.model.ItemsDomain;
import com.kanma.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ Desc   ：controller
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/2 23:01
 */
@RestController
@RequestMapping(value = "/items",method = RequestMethod.GET)
public class ItemsController {
        @Autowired
        private ItemsService itemsService;

        @RequestMapping(value = "/list")
        public List<ItemsDomain> findAll(){
                return itemsService.findAllItems();
        }

}
