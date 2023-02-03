package com.javarush.task.pro.task16.task1620;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* 
Еще один простой шаблон
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String str = dft.format(zonedDateTime);
        System.out.println(str);
    }
}
