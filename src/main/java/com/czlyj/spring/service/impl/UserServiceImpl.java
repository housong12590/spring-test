package com.czlyj.spring.service.impl;

import com.czlyj.spring.bean.User;
import com.czlyj.spring.mapper.UserMapper;
import com.czlyj.spring.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(int id) {
        return userMapper.find(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.findAll();
    }

    @Override
    public User findUserByName(String username) {
        return userMapper.;
    }
}
