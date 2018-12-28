package com.mmg.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
                LocalDateTime.of(2018,12,25,
                        8,0,0);
        LocalDateTime leave =
                LocalDateTime.of(2018,12,25,
                        10,8,0);
        Car car = new Car("ABC-1234",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration()/60f);  //Math.ceil = 無條件進位
        System.out.println(hours);
//        java8();
        //java();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime otherTime =
                LocalDateTime.of(2018,12,31,23,59,59);
        System.out.println(otherTime);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2018/12/28 08:00:00";
        Date otherDay = null;
        try {
            otherDay = sdf.parse(s);
            System.out.println("otherDay" + otherDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,11);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_WEEK,4);
        System.out.println(calendar.getTime());
    }
}
