//package com.focus.framework.base.annotations.condition.parser;
//
//import com.baomidou.mybatisplus.mapper.EntityWrapper;
//import com.focus.framework.base.annotations.condition.Gt;
//
//import java.lang.reflect.Field;
//
//public class GtParser implements ConditionParser<Gt>{
//    @Override
//    public void parser(Gt gt, boolean reverse, Field conditionField, Object value, EntityWrapper wrapper) {
//        final String columnName = conditionField.getName();
//        if (reverse) wrapper.lt(columnName, value);
//        else wrapper.gt(columnName, value);
//    }
//}
