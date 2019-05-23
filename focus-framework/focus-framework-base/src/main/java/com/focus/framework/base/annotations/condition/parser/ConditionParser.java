package com.focus.framework.base.annotations.condition.parser;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public interface ConditionParser<A extends Annotation> {


    void parser(A a, boolean reverse, Field conditionField, Object value,  EntityWrapper wrapper);

}
