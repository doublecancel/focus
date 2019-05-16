package com.focus.entity.enums.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Getter
public enum  StatusEnum {
    DEFAULT(1),
    OK(1),
    BAD(0);

    private Integer type;

    public static StatusEnum from(Integer type){
        if (type == null) return null;
        StatusEnum[] values = StatusEnum.values();
        return Arrays.stream(values)
                .filter(a -> a.getType().equals(type))
                .findFirst()
                .orElse(DEFAULT);
    }
}
