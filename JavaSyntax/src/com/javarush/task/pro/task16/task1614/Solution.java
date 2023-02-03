package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишите тут ваш код

        Instant maxMil = Instant.ofEpochMilli(Long.MAX_VALUE);

        return maxMil;
    }

    static Instant getMaxFromSeconds() {
        //напишите тут ваш код
        long maxSec = Instant.MAX.getEpochSecond();

        return Instant.MAX.ofEpochSecond(maxSec);
    }

    static Instant getMaxFromSecondsAndNanos() {
        //напишите тут ваш код
        long maxSec = Instant.MAX.getEpochSecond();
        long maxMilli = 999_999_999L;

        return Instant.ofEpochSecond(maxSec, maxMilli);
    }
}
