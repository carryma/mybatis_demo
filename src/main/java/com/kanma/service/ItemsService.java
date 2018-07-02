package com.kanma.service;

import com.kanma.model.ItemsDomain;

import java.util.List;

/**
 * @ Desc   ：sevice接口
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/2 22:46
 */
public interface ItemsService {
    List<ItemsDomain> findAllItems();
}