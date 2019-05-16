package com.focus.framework.mybatis.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

public class MybatisImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(
                importingClassMetadata.getAnnotationAttributes(EnableMybatisType.class.getName(), false));

        MybatisType value = annotationAttributes.getEnum("value");
        switch (value){
            case PLUS:  return new String[]{MybatisPlusConfiguration.class.getName()};
            case NORMAL:  return new String[]{MybatisConfiguration.class.getName()};
                default: return new String[]{MybatisConfiguration.class.getName()};
        }
    }
}
