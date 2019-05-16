package com.focus.entity.beans.bo.uc;

import com.focus.entity.enums.common.StatusEnum;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInfoBo {

    private Long id;
    private Long userAccountId;
    private String loginName;
    private String nickName;
    private String realName;
    private Integer modifyPassword;
    private LocalDateTime lastLoginDate;
    private String lastLoginIp;
    private StatusEnum status;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
