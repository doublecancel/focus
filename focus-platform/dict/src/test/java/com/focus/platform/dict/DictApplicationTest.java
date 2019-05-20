package com.focus.platform.dict;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.focus.entity.beans.bo.uc.UserInfoBo;
import com.focus.framework.feign.clients.uc.UserInfoClient;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DictApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DictApplicationTest {


    @Autowired
    private UserInfoClient userInfoClient;


    @Test
    public void selectUserInfoById() {
        UserInfoBo userInfoBo = userInfoClient.selectInfoById(1L);
        System.out.println(new Gson().toJson(userInfoBo));
    }

    @Test
    public void selectOneByCondition() {
        Map<String  , Object> map = ImmutableMap.of(
                "nick_name", "liuxl",
                "status", 1
        );
        UserInfoBo userInfoBo = userInfoClient.selectOneByCondition(map);
        System.out.println(new Gson().toJson(userInfoBo));
    }

    @Test
    public void selectOneByCondition1() {
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.like("real_name", "liuxianglei");
        wrapper.groupBy("status");
        wrapper.eq("nick_name", "liuxl");

        UserInfoBo userInfoBo = userInfoClient.selectOneByCondition(wrapper);
        System.out.println(new Gson().toJson(userInfoBo));
    }

    @Test
    public void saveOrUpdate() {





    }

    @Test
    public void selectPaging() {
        Page page = new Page();
        page.setSearchCount(true);
        page.setCurrent(2);
        page.setSize(2);
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.like("real_name", "liuxianglei");
//        wrapper.groupBy("status");
//        wrapper.eq("nick_name", "abc");

        userInfoClient.selectPaging(page, wrapper);
    }

    @Test
    public void selectListByCondition() {
        Map<String  , Object> map = ImmutableMap.of(
                "nick_name", "liuxl",
                "status", 1
        );
        List<UserInfoBo> userInfoBos = userInfoClient.selectListByCondition(map);
        System.out.println(new Gson().toJson(userInfoBos));
    }

    @Test
    public void selectListByWapper() {
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.like("real_name", "liuxianglei");
        wrapper.groupBy("status");
        wrapper.eq("nick_name", "liuxl");

        List<UserInfoBo> userInfoBos = userInfoClient.selectListByWapper(wrapper);
        System.out.println(new Gson().toJson(userInfoBos));
    }


    //    @Test
    public void deleteById(){
        boolean b = userInfoClient.deleteById(4L);
        System.out.println(b);
    }

}