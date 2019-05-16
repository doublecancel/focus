package com.focus.framework.common;

import com.google.common.base.Strings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {


    private static final String pattern = "yyyy-MM-dd HH:mm:ss";

    public static LocalDateTime parse(String date){
        if (Strings.isNullOrEmpty(date)) return null;
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern(pattern));
    }


    public static String format(LocalDateTime date){
        if (date == null) return null;
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }






}
