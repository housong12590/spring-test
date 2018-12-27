package com.czlyj.spring.controller;

import com.czlyj.spring.bean.User;
import com.czlyj.spring.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> users() {
        return userService.getUserList();
    }

    @GetMapping("user/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

}
