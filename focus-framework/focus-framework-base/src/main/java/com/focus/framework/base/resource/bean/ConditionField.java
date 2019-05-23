package com.focus.framework.base.resource.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

@Data
@AllArgsConstructor(staticName = "create")
public class ConditionField {

    private Field field;
    private Object target;
    private List<Annotation> annotations;
}
