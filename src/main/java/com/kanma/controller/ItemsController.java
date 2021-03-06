package com.kanma.controller;

import com.kanma.model.ItemsDomain;
import com.kanma.model.User;
import com.kanma.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Desc   ：controller
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/2 23:01
 */
@RestController
public class ItemsController {
        @Autowired
        private ItemsService itemsService;

        @RequestMapping(value = "/items/list",method = RequestMethod.GET)
        public List<ItemsDomain> findAll(){
                return itemsService.findAllItems();
        }

        @RequestMapping(value = "/items/add",method = RequestMethod.POST)
        public int addUser(User user){
                return itemsService.insertUser(user);
        }

        @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
        public User selectUserById(@PathVariable Integer id){
                return itemsService.selectById(id);
        }
}
