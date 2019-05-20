package com.focus.framework.feign.clients.uc;

import com.focus.entity.beans.bo.uc.UserAccountBo;
import com.focus.entity.beans.bo.uc.UserInfoBo;
import com.focus.entity.beans.dto.uc.UserAccountDto;
import com.focus.entity.beans.dto.uc.UserInfoDto;
import com.focus.framework.base.resource.IServiceClient;
import com.focus.framework.feign.clients.annotations.UcClient;

import static com.focus.entity.enums.common.constants.ResourcePathConstants.USER_ACCOUNT_PATH;
import static com.focus.entity.enums.common.constants.ResourcePathConstants.USER_INFO_PATH;

@UcClient(path = UserAccountClient.path)
public interface UserAccountClient extends IServiceClient<UserAccountDto, UserAccountBo, Long> {
    String path = USER_ACCOUNT_PATH;







}
