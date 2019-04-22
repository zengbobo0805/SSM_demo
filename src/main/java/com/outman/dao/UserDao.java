package com.outman.dao;

import com.outman.po.User;

import java.util.List;

/**
 * Created by zhangxiaoliang on 2017/7/12.
 */
public interface UserDao {
    User findUserById(int id) throws Exception;


    List<User> getAll() throws Exception;
}
