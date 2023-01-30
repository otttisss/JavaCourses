package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //напишите тут ваш код
        int index = month.ordinal();
        Month[] array = Month.values();
        if (index < array.length - 1){
            return Month.values()[index + 1];
        }
        else{
            return Month.values()[0];
        }
    }
}
