package com.example.movies.dao;

import com.example.movies.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface UserDao {

    @Select(value = "select a.username,a.password from user a where 1 = 1")
    List<User> selectAllUser();

    @Select(value = "select id from user where id=#{id}")
    Integer selectUsername(Integer id);

    @Insert(value = "insert into user (id,username) values(#{id},'cc')")
    void insertIntoUser(Integer id);
}
