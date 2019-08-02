//package com.focus.framework.base.annotations.condition;
//
//import com.baomidou.mybatisplus.enums.SqlLike;
//import com.focus.framework.base.annotations.condition.parser.LikeParser;
//import com.focus.framework.base.annotations.condition.parser.LikeType;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.FIELD)
//@Parser(LikeParser.class)
//public @interface Like {
//
//    String fieldName() default "";
//
//    SqlLike type() default SqlLike.DEFAULT;
//
//    boolean reverse() default false;
//
//    String group() default "group0";
//
//}
