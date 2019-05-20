package com.focus.platform.uc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author liuxl
 * @since 2019-05-15
 */
@Controller
@RequestMapping("/uc/user-info")
public class UserInfoController {



    @GetMapping
    public String test(){
        return "test";
    }

}
