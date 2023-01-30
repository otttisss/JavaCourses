package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код
    public static Month[] getWinterMonths(){
        ArrayList<Month> list = new ArrayList<Month>();

        Collections.addAll(list, values());
        Collections.rotate(list, 1);
        Month[] array = list.toArray(new Month[list.size()]);
        Month[] copy = Arrays.copyOfRange(array, 0, 3);

        return copy;
    }
    public static Month[] getSpringMonths(){
        Month[] array = Month.values();
        Month[] copy = new Month[3];
        copy = Arrays.copyOfRange(array, 2, 5);
        return copy;
    }

    public static Month[] getSummerMonths(){
        Month[] array = Month.values();
        Month[] copy = new Month[3];
        copy = Arrays.copyOfRange(array, 5, 8);
        return copy;
    }

    public static Month[] getAutumnMonths(){
        Month[] array = Month.values();
        Month[] copy = new Month[3];
        copy = Arrays.copyOfRange(array, 8, 11);
        return copy;
    }

}
