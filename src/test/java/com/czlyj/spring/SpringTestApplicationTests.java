package com.czlyj.spring;

import com.czlyj.spring.bean.User;
import com.czlyj.spring.mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
public class SpringTestApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Autowired
    UserMapper userMapper;

    @Test
    public void testSql() {
        List<User> all = userMapper.findAll();
        System.out.println(all);
    }
}


