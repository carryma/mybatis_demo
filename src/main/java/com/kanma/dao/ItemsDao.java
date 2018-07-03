package com.kanma.dao;

import com.kanma.model.ItemsDomain;
import com.kanma.model.User;

import java.util.List;

/**
 * @ Desc   ：Dao接口
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/7/2 22:24
 */
public interface ItemsDao {
    int insertUser(User record);
    List<ItemsDomain> selectItems();
    User selectById(Integer id);
}