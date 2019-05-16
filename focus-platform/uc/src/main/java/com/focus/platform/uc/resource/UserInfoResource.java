package com.focus.platform.uc.resource;

import com.focus.entity.beans.bo.uc.UserInfoBo;
import com.focus.framework.common.bean.BeanMapper;
import com.focus.framework.feign.clients.uc.UserInfoClient;
import com.focus.platform.uc.entity.UserInfo;
import com.focus.platform.uc.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserInfoClient.path)
public class UserInfoResource implements UserInfoClient {


    @Autowired
    IUserInfoService userInfoService;

    @Override
    public UserInfoBo selectUserInfoById(@PathVariable("id") Long id) {
        UserInfo userInfo = userInfoService.getById(id);
        return BeanMapper.map(userInfo, UserInfoBo.class);
    }
}
