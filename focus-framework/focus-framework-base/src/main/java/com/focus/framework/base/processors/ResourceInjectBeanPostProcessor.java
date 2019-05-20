package com.focus.framework.base.processors;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.focus.framework.base.utils.AopTargetUtils;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class ResourceInjectBeanPostProcessor implements BeanPostProcessor , ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(ResourceInjectBeanPostProcessor.class);

    private ApplicationContext context;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        List<Field> fields = Lists.newArrayList();

        if (bean.getClass().getName().contains("UserInfoCommonResource") || bean.getClass().getName().contains("ServiceClient")){
            logger.debug("--------------------------");
        }

        ReflectionUtils.doWithFields(bean.getClass(), field -> {
            if (field.isAnnotationPresent(ClientAutowired.class)){
                fields.add(field);
            }
        });

        if (fields.size() > 1) throw new RuntimeException("只能注入一次service");


        if (!fields.isEmpty()){
            Field clientServiceField = fields.get(0);
            Class dtoClass = (Class) ((ParameterizedType) bean.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            Class boClass = (Class) ((ParameterizedType) bean.getClass().getGenericSuperclass()).getActualTypeArguments()[1];

            final String dtoName = dtoClass.getSimpleName();
            final String boName = boClass.getSimpleName();
            Map<String, ServiceImpl> beansOfType = context.getBeansOfType(ServiceImpl.class);

            Object service  = beansOfType.entrySet().stream()
                    .filter(t -> {
                        Object value = AopTargetUtils.getTarget(t.getValue());
                        Class entityClass = (Class) ((ParameterizedType) value.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
                        if (dtoName.startsWith(entityClass.getSimpleName()) || boName.startsWith(entityClass.getSimpleName())) {
                            return true;
                        }
                        return false;
                    }).map(t -> t.getValue())
                    .peek(t -> {
//                        logger.info("寻找到的service：{}", t.getClass().getName());
                    }).findFirst()
                    .orElseThrow(() -> new RuntimeException("找不到service"));

            ReflectionUtils.makeAccessible(clientServiceField);
            try {
                logger.info("resource:{},注入service:{}", bean.getClass().getName(), service.getClass().getName());
                clientServiceField.set(bean, service);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
