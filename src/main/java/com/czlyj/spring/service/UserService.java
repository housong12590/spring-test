package com.czlyj.spring.service;

import com.czlyj.spring.bean.User;

import java.util.List;

public interface UserService {

    User getUser(int id);

    List<User> getUserList();

    User findUserByName(String username);
}
