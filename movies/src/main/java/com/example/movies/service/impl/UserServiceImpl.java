package com.example.movies.service.impl;

import com.example.movies.dao.UserDao;
import com.example.movies.entity.User;
import com.example.movies.global.Constant;
import com.example.movies.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.selectAllUser();
    }

    @Override
    public boolean login(String username,String password) {
        if(StringUtils.hasText(username) && StringUtils.hasText(password)){
            try{
                int id = Integer.parseInt(username);
                System.out.println(userDao.selectUsername(id));
                if (id == userDao.selectUsername(id) && Constant.LOGIN_PASSWORD.equals(password))
                    return true;
            }catch (RuntimeException e){
                return false;
            }
        }
        return false;
    }

    @Override
    public void insert(Integer id) {
        userDao.insertIntoUser(id);
    }
}
