package com.focus.platform.dict;

import com.focus.framework.mybatis.config.EnableMybatisType;
import com.focus.framework.mybatis.config.MybatisType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableMybatisType(MybatisType.PLUS)
public class DictApplication {

    public static void main(String[] args) {
        SpringApplication.run(DictApplication.class, args);
    }


}
