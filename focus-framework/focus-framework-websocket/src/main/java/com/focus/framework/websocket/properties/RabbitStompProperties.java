package com.focus.framework.websocket.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.rabbitmq")
@Component
@Data
public class RabbitStompProperties {
    private String host;
    private String username;
    private String password;
    private Integer port;
    private Integer stomp;
}
