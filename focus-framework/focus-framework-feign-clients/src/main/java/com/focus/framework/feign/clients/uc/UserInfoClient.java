package com.focus.framework.feign.clients.uc;

import com.focus.entity.beans.bo.uc.UserInfoBo;
import com.focus.framework.feign.clients.annotations.UcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static com.focus.entity.enums.common.constants.ResourcePathConstants.USER_INFO_PATH;

@UcClient(path = UserInfoClient.path)
public interface UserInfoClient {

    String path = USER_INFO_PATH;

    @GetMapping("/{id}")
    UserInfoBo selectUserInfoById(@PathVariable("id") Long id);

}
