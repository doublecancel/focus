package com.focus.framework.base.annotations.condition;

import com.focus.framework.base.annotations.condition.parser.ConditionParser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Parser {


    Class<? extends ConditionParser> value();


}
