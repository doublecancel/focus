package com.focus.framework.base.annotations.condition;

import com.focus.framework.base.annotations.condition.parser.GeParser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Parser(GeParser.class)
public @interface Ge {

    String fieldName() default "";

    boolean reverse() default false;

    String group() default "group0";

}
