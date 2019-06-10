package com.focus.framework.websocket;

import com.focus.framework.websocket.bean.MessageDto;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "websocket相关接口")
public class WsController {

    @Autowired
    SimpMessagingTemplate template;

    private static final Logger logger = LoggerFactory.getLogger(WsController.class);

    @ApiOperation("通知所有当前在线的用户信息")
    @MessageMapping("/notifyAll") //订阅地址/topic/notifyAll
    @SendTo(Constants.ALL) //发送地址 /topic/notifyAll
    public ResponseEntity<MessageDto> notifyAll(@RequestBody MessageDto dto) {
        logger.debug("接受到消息={}", new Gson().toJson(dto));
        logger.debug("开始通知所有当前用户");
        return ResponseEntity.ok(dto);
    }



    @ApiOperation("通知指定的在线用户信息")
    @MessageMapping("/notifyOne")
//    @SendToUser(Constants.ONE)//如果服务器接受到了消息，就会对订阅了@SendTo括号中的地址传送消息。
    public String notifySingle(@RequestBody MessageDto dto) throws Exception {
        template.convertAndSendToUser("2", Constants.ONE,  dto.getContent());
        return "say:" + dto.getContent();
    }




}
