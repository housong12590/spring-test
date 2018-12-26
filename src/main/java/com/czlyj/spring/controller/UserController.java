package com.czlyj.spring.controller;

import com.czlyj.spring.bean.User;
import com.czlyj.spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/users")
    public List<User> users() {
        return userMapper.findAll();
    }

    @GetMapping("user/{id}")
    public User getUser(@PathVariable("id") int id) {
        User user = userMapper.find(id);
        int count = userMapper.count();
        System.out.println(count);
        return user;
    }

}
