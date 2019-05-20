package com.focus.platform.uc;

import com.focus.framework.mybatis.config.EnableMybatisType;
import com.focus.framework.mybatis.config.MybatisType;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
@EnableMybatisType(MybatisType.PLUS)
public class UcApplication  {

    public static void main(String[] args) {
        SpringApplication.run(UcApplication.class, args);
    }

}
