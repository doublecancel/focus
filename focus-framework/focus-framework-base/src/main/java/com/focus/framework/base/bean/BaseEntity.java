package com.focus.framework.base.bean;

import com.focus.entity.enums.common.StatusEnum;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity extends IEntity{

    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private StatusEnum status;
    private Integer version;
    private Long createUserId;
    private Long updateUserId;
    private String createUserName;
    private String updateUserName;


}
