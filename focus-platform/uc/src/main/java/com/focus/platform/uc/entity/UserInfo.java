package com.focus.platform.uc.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;

import java.time.LocalDateTime;

import com.focus.entity.enums.common.StatusEnum;
import com.focus.framework.base.bean.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author liuxl
 * @since 2019-05-15
 */
@Data
@Accessors(chain = true)
@TableName("user_info")
public class UserInfo  {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    /**
     * 账户表id
     */
    @TableField("user_account_id")
    private Long userAccountId;

    /**
     * 登录名
     */
    @TableField("login_name")
    private String loginName;

    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;

    /**
     * 是否修改密码0否1是
     */
    @TableField("modify_password")
    private Integer modifyPassword;

    /**
     * 上次登录时间
     */
    @TableField("last_login_date")
    private LocalDateTime lastLoginDate;

    /**
     * 上次登录IP
     */
    @TableField("last_login_ip")
    private String lastLoginIp;

    /**
     * 状态1有效0失效
     */
    @TableField("status")
    private StatusEnum status;

    /**
     * 创建时间，注册时间
     */
    @TableField("create_date")
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    @TableField("update_date")
    private LocalDateTime updateDate;


    public static final String USER_ACCOUNT_ID = "user_account_id";

    public static final String LOGIN_NAME = "login_name";

    public static final String NICK_NAME = "nick_name";

    public static final String REAL_NAME = "real_name";

    public static final String MODIFY_PASSWORD = "modify_password";

    public static final String LAST_LOGIN_DATE = "last_login_date";

    public static final String LAST_LOGIN_IP = "last_login_ip";

    public static final String STATUS = "status";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_DATE = "update_date";

}
