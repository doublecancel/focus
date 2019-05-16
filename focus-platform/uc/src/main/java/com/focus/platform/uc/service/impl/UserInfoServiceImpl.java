package com.focus.platform.uc.service.impl;

import com.focus.platform.uc.entity.UserInfo;
import com.focus.platform.uc.mapper.UserInfoMapper;
import com.focus.platform.uc.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author liuxl
 * @since 2019-05-15
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
