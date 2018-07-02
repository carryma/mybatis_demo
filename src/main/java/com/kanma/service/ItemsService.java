package com.kanma.service;

import com.kanma.model.ItemsDomain;
import com.kanma.model.User;

import java.util.List;

/**
 * @ Desc   ：sevice接口
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/2 22:46
 */
public interface ItemsService {
    List<ItemsDomain> findAllItems();
    int insertUser(User record);
}