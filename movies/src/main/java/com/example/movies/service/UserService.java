package com.example.movies.service;


import com.example.movies.entity.User;

import java.util.List;

public interface UserService {

    //获取所有的用户
    List<User> getAllUsers();

    //验证登录
    boolean login(String username,String password);

    void insert(Integer id);
}
