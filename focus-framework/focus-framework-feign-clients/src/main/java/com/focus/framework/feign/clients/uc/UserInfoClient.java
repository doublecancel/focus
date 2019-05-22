package com.focus.framework.feign.clients.uc;

import com.focus.entity.beans.bo.uc.UserInfoBo;
import com.focus.entity.beans.dto.uc.UserInfoDto;
import com.focus.framework.base.resource.IServiceClient;
import com.focus.framework.feign.clients.annotations.UcClient;

import static com.focus.entity.enums.common.constants.ResourcePathConstants.USER_INFO_PATH;

@UcClient(path = UserInfoClient.path)
public interface UserInfoClient  extends IServiceClient<UserInfoDto, UserInfoBo, Long> {
    String path = USER_INFO_PATH;







}
