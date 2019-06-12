package com.focus.framework.websocket;

import com.focus.framework.websocket.properties.RabbitStompProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import static com.focus.framework.websocket.Constants.TOPIC;

/**
 * rabbitmq 的stomp协议，可以在gateway中进行使用，不能使用@SendTo，只能使用SimMessageTemplate进行发送
 */
//@Configuration
//@EnableWebSocketMessageBroker
public class WebsocketStompConfig implements WebSocketMessageBrokerConfigurer {

    @Autowired
    RabbitStompProperties rabbitProperties;

    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        //注册一个Stomp的节点（endpoint）,并指定使用SockJS协议。
        stompEndpointRegistry.addEndpoint(Constants.WEB_SOCKET).setAllowedOrigins("*").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableStompBrokerRelay(TOPIC)
                .setRelayHost(rabbitProperties.getHost())
                .setRelayPort(rabbitProperties.getStomp())
                .setSystemLogin(rabbitProperties.getUsername())
                .setSystemPasscode(rabbitProperties.getPassword())
                .setClientLogin(rabbitProperties.getUsername())
                .setClientPasscode(rabbitProperties.getPassword())
                .setSystemHeartbeatSendInterval(5000)
                .setSystemHeartbeatReceiveInterval(4000);
    }










}
