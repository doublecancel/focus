package com.focus.platform.uc.resource;

import com.focus.entity.beans.bo.uc.UserInfoBo;
import com.focus.entity.beans.dto.uc.UserInfoDto;
import com.focus.framework.base.resource.BaseServiceClientImpl;
import com.focus.framework.feign.clients.uc.UserInfoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserInfoClient.path)
public class UserInfoResource extends BaseServiceClientImpl<UserInfoDto, UserInfoBo, Long> implements UserInfoClient {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoResource.class);


}
