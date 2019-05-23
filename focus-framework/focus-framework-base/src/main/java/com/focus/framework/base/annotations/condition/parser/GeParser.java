package com.focus.framework.base.annotations.condition.parser;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.focus.framework.base.annotations.condition.Ge;

import java.lang.reflect.Field;

public class GeParser implements ConditionParser<Ge>{
    @Override
    public void parser(Ge ge, boolean reverse, Field conditionField, Object value, EntityWrapper wrapper) {
        final String columnName = conditionField.getName();
        if (reverse) wrapper.le(columnName, value);
        else wrapper.ge(columnName, value);
    }
}
