package com.focus.framework.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import static com.focus.framework.websocket.Constants.ALL;

@SpringBootApplication(scanBasePackages = "com.focus.framework.websocket")
@EnableScheduling
@EnableDiscoveryClient
public class WebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketApplication.class, args);
    }

    @Autowired
    private SimpMessagingTemplate template;

    @Scheduled(fixedRate = 2000)
    public void send(){
//        template.convertAndSend(ALL, "success");
    }

}
