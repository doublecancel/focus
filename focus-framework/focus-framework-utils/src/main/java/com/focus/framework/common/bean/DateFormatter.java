package com.focus.framework.common.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SuppressWarnings("all")
public enum DateFormatter {


    YMD("yyyy-MM-dd"){
        @Override
        public String format(LocalDateTime time) {
            final String pattern = this.getPattern();
            return time.format(DateTimeFormatter.ofPattern(pattern));
        }

        @Override
        public String format(Date time) {
            final String pattern = this.getPattern();
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(time);
        }

        @Override
        public LocalDateTime parseLocalDateTime(String time) {
            final String pattern = this.getPattern();
            LocalDate localDate = LocalDate.parse(time, DateTimeFormatter.ofPattern(pattern));
            return LocalDateTime.of(localDate, LocalTime.of(0, 0, 0, 0));
        }

        @Override
        public Date parseDate(String time) {
            final String pattern = this.getPattern();
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            try {
                return sdf.parse(time);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    },

    YMDHMS("yyyy-MM-dd HH:mm:ss"){
        @Override
        public String format(LocalDateTime time) {
            final String pattern = this.getPattern();
            return time.format(DateTimeFormatter.ofPattern(pattern));
        }

        @Override
        public String format(Date time) {
            final String pattern = this.getPattern();
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(time);
        }

        @Override
        public LocalDateTime parseLocalDateTime(String time) {
            final String pattern = this.getPattern();
            return LocalDateTime.parse(time, DateTimeFormatter.ofPattern(pattern));
        }

        @Override
        public Date parseDate(String time) {
            final String pattern = this.getPattern();
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            try {
                return sdf.parse(time);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    },

    YMDHMSS("yyyy-MM-dd HH:mm:ss SSS"){
        @Override
        public String format(LocalDateTime time) {
            final String pattern = this.getPattern();
            return time.format(DateTimeFormatter.ofPattern(pattern));
        }

        @Override
        public String format(Date time) {
            final String pattern = this.getPattern();
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(time);
        }

        @Override
        public LocalDateTime parseLocalDateTime(String time) {
            final String pattern = this.getPattern();
            return LocalDateTime.parse(time, DateTimeFormatter.ofPattern(pattern));
        }

        @Override
        public Date parseDate(String time) {
            final String pattern = this.getPattern();
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            try {
                return sdf.parse(time);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    },






    ;

    private String pattern;

    DateFormatter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public abstract String format(LocalDateTime time);

    public abstract String format(Date time);

    public abstract LocalDateTime parseLocalDateTime(String time);

    public abstract Date parseDate(String time);

    public static LocalDateTime parse(Date date){
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        return localDateTime;
    }

    public static Date parse(LocalDateTime dateTime){
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = dateTime.atZone(zone).toInstant();
        Date date = Date.from(instant);
        return date;
    }

//    public static void main(String[] args) {
//
//        System.out.println(DateFormatter.YMD.format(LocalDateTime.now()));
//        System.out.println(DateFormatter.YMDHMS.format(LocalDateTime.now()));
//        System.out.println(DateFormatter.YMDHMSS.format(LocalDateTime.now()));
//
//    }

}
