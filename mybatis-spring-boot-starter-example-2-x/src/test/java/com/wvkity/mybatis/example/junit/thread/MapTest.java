package com.wvkity.mybatis.example.junit.thread;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class MapTest {

    static final Map<Long, String> CACHE = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        Long a1 = 1L;
        Long a2 = 2L;
        Long a3 = 128L;
        CACHE.put(a1, "1");
        CACHE.put(a2, "2");
        CACHE.put(a3, "128");
        System.out.println(CACHE.get(a2));
        System.out.println(CACHE.get(new Long("1")));
        System.out.println(CACHE.get(a3));
        System.out.println(CACHE.get(new Long("128")));
        Pattern pattern = Pattern.compile("^(0\\d|1[0-9]|2[0-3]):(0\\d|[1-5]\\d):(0\\d|[1-5]\\d)");
        System.out.println(pattern.matcher("").matches());
        LocalDate d1 = LocalDate.of(2020, 6, 15);
        LocalDate d2 = LocalDate.of(2020, 6, 15);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(dt.toLocalDate()));
    }
}
