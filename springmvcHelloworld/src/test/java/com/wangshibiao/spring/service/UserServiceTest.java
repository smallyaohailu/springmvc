package com.wangshibiao.spring.service;

import com.wangshibiao.spring.BaseTest;
import com.wangshibiao.spring.model.User;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Wang Shibiao on 2016/6/24.
 */
public class UserServiceTest extends BaseTest{
    @Resource
    UserService userService;

    @Test
    public void getUserByUserName(){
        User user = userService.getUserByUserName("admin");
    }
}
