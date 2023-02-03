package com.javarush.task.pro.task16.task1615;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/* 
Ой как много методов!
*/

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        //напишите тут ваш код
        Instant min = instant.plusSeconds(60 * minutes);
        return min;
    }

    static public Instant plusHours(Instant instant, long hours) {
        //напишите тут ваш код
        Instant hour = instant.plusSeconds(3600 * hours);
        return hour;
    }

    static public Instant plusDays(Instant instant, long days) {
        //напишите тут ваш код
        Instant day = instant.plusSeconds(86400 * days);

        return day;
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        Instant min = instant.minusSeconds(60 * minutes);
        return min;
    }

    static public Instant minusHours(Instant instant, long hours) {
        Instant hour = instant.minusSeconds(3600 * hours);
        return hour;
    }

    static public Instant minusDays(Instant instant, long days) {
        Instant day = instant.minusSeconds(86400 * days);

        return day;
    }
}
