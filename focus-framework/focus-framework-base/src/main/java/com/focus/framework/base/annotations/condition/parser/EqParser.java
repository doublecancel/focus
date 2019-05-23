package com.focus.framework.base.annotations.condition.parser;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.focus.framework.base.annotations.condition.Eq;

import java.lang.reflect.Field;

public class EqParser implements ConditionParser<Eq> {


    @Override
    public void parser(Eq eq, boolean reverse, Field conditionField, Object value, EntityWrapper wrapper) {
        final String columnName = conditionField.getName();
        if (reverse) wrapper.ne(columnName, value);
        else wrapper.eq(columnName, value);
    }
}
