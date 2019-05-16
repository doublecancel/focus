package com.focus.framework.mybatis.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MybatisImportSelector.class)
public @interface EnableMybatisType {

    MybatisType value() default MybatisType.NORMAL;
}
