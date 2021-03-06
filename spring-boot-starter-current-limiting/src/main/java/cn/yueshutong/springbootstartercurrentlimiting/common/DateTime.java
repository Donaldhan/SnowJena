package cn.yueshutong.springbootstartercurrentlimiting.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Create by yster@foxmail.com 2019/5/1 0001 20:19
 */
public class DateTime {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String now() {
        return LocalDateTime.now().format(formatter);
    }

    public static String toString(LocalDateTime localDateTime) {
        return localDateTime.format(formatter);
    }

    public static LocalDateTime parse(String substring) {
        return LocalDateTime.parse(substring, formatter);
    }
}
