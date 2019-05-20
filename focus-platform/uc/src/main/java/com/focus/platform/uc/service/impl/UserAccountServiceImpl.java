package com.focus.platform.uc.service.impl;

import com.focus.platform.uc.entity.UserAccount;
import com.focus.platform.uc.mapper.UserAccountMapper;
import com.focus.platform.uc.service.IUserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuxl
 * @since 2019-05-18
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements IUserAccountService {

}
