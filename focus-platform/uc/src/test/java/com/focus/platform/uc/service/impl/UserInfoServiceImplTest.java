package com.focus.platform.uc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.focus.platform.uc.UcApplication;
import com.focus.platform.uc.entity.UserInfo;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UcApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserInfoServiceImplTest {

    @Autowired
    UserInfoServiceImpl service;


    @Test
    public void test(){
        UserInfo byId = service.getById(1);
        System.out.println(new Gson().toJson(byId));


        QueryWrapper wrapper = new QueryWrapper<UserInfo>();
        wrapper.select(UserInfo.STATUS);
        wrapper.eq(UserInfo.LOGIN_NAME, "loginName");
        UserInfo one = service.getOne(wrapper);
        System.out.println(new Gson().toJson(one));

    }

}