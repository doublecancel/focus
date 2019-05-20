package com.focus.entity.beans.dto.uc;

import com.focus.entity.enums.common.StatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;


@ApiModel
@Data
public class UserInfoDto {

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("用户账户id")
    private Long userAccountId;

    @ApiModelProperty("登录名")
    private String loginName;

    @ApiModelProperty("昵称")
    private String nickName;

    @ApiModelProperty("真实姓名")
    private String realName;

    @ApiModelProperty("是否修改密码")
    private Integer modifyPassword;

    @ApiModelProperty("上次登录时间")
    private LocalDateTime lastLoginDate;

    @ApiModelProperty("上次登录IP")
    private String lastLoginIp;

    @ApiModelProperty("状态")
    private StatusEnum status;

    @ApiModelProperty("创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateDate;


}
