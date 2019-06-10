package com.focus.framework.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class WebsocketPushUtils {


    private static SimpMessagingTemplate template;

    @Autowired
    public WebsocketPushUtils(SimpMessagingTemplate template) {
        WebsocketPushUtils.template = template;
    }


    /**
     * 广播
     * 发给所有在线用户
     *
     * @param msg
     */
    public static void sendMsg(String msg) {
        template.convertAndSend(Constants.ALL, msg);
    }

    /**
     * 发送给指定用户
     *
     * @param users
     * @param msg
     */
    public static void send2Users(List<String> users, String msg) {
        users.forEach(userName -> {
            template.convertAndSendToUser(userName, Constants.ONE, msg);
        });
    }

    private AtomicInteger count = new AtomicInteger(0);

}
