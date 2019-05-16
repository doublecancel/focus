package com.focus.platform.common;

import com.focus.framework.mybatis.config.EnableMybatisType;
import com.focus.framework.mybatis.config.MybatisType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableMybatisType(MybatisType.NORMAL)
@SpringBootApplication
public class AbstractApplicationContext {
}
