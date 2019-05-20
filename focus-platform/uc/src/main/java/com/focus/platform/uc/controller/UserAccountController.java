package com.focus.platform.uc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuxl
 * @since 2019-05-18
 */
@Controller
@RequestMapping("/uc/user-account")
public class UserAccountController {


    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }


}
