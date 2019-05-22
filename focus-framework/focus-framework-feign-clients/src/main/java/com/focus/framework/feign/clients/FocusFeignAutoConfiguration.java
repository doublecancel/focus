package com.focus.framework.feign.clients;

import feign.Feign;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Feign.class)
@EnableFeignClients(basePackages = "com.focus.framework.feign.clients")
public class FocusFeignAutoConfiguration {


}
