package com.focus.framework.websocket.bean;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel
@Data
public class MessageDto {
    private String title;
    private String content;
    private String createUserName;
    private String createDate;
}
