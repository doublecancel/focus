package com.focus.framework.base.annotations.condition.parser;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.focus.framework.base.annotations.condition.Like;

import java.lang.reflect.Field;

public class LikeParser implements ConditionParser<Like> {
    @Override
    public void parser(Like like, boolean reverse, Field conditionField, Object value, EntityWrapper wrapper) {
        final String columnName = conditionField.getName();
        if (reverse) {
            wrapper.notLike(true, columnName, value.toString(), like.type());
        } else {
            wrapper.like(true, columnName, value.toString(), like.type());
        }
    }
}
