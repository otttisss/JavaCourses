package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код
        LocalDate date = LocalDate.now();

        return date;
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 12);
        return date;
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        int x = ofExample().getDayOfYear();

        LocalDate date = LocalDate.ofYearDay(2020, x);

        return date;
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        long epoch = LocalDate.of(2020, 9, 12).toEpochDay();

        LocalDate date = LocalDate.ofEpochDay(epoch);
        return date;
    }
}
