package com.focus.platform.uc;

import com.focus.framework.mybatis.config.EnableMybatisType;
import com.focus.framework.mybatis.config.MybatisType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableMybatisType(MybatisType.PLUS)
public class UcApplication  {

    public static void main(String[] args) {
        SpringApplication.run(UcApplication.class, args);
    }

}
