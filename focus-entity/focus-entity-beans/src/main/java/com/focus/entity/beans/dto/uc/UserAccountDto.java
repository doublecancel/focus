package com.focus.entity.beans.dto.uc;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author liuxl
 * @since 2019-05-18
 */
@Data
@Accessors(chain = true)
public class UserAccountDto {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    /**
     * 登录名
     */
    @TableField("login_name")
    private String loginName;

    /**
     * 登录密码
     */
    @TableField("login_password")
    private String loginPassword;

    /**
     * 交易密码
     */
    @TableField("deal_password")
    private String dealPassword;

    @TableField("create_date")
    private LocalDateTime createDate;

    @TableField("status")
    private Integer status;


    public static final String LOGIN_NAME = "login_name";

    public static final String LOGIN_PASSWORD = "login_password";

    public static final String DEAL_PASSWORD = "deal_password";

    public static final String CREATE_DATE = "create_date";

    public static final String STATUS = "status";

}
