package com.focus.framework.mybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.FileNotFoundException;

@Configuration
public class MybatisConfiguration {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private DataSource dataSource;


    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeHandlersPackage("com.focus.framework.mybatis.config.handlers");
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath:/mapper/**/*Mapper.xml"));
            return bean.getObject();
        } catch (FileNotFoundException e){
            logger.warn("找不到mapper文件，mybatis配置失败");
        } catch (Exception e) {
            logger.error("配置mybatis失败",e);
            throw new RuntimeException(e);
        }
        return null;

    }



}
