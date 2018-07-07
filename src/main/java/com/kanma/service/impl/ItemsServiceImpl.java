package com.kanma.service.impl;

import com.kanma.mapper.ItemsDao;
import com.kanma.model.ItemsDomain;
import com.kanma.model.User;
import com.kanma.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Desc   ：service实现类
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/2 22:50
 */

@Service(value = "itemsService")
public class ItemsServiceImpl implements ItemsService{

    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<ItemsDomain> findAllItems() {
        List<ItemsDomain> itemsDomains = itemsDao.selectItems();
        return itemsDomains;
    }

    @Override
    public int insertUser(User record) {
        return itemsDao.insertUser(record);
    }

    @Override
    public User selectById(Integer id) {
        return itemsDao.selectById(id);
    }
}
