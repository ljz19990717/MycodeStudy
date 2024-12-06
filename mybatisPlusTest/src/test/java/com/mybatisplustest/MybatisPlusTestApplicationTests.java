package com.mybatisplustest;

import com.mybatisplustest.mapper.UserMapper;
import com.mybatisplustest.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusTestApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

        userMapper.insert(new User(null,"ssss",33,"ssss@163.com"));

    }

}
