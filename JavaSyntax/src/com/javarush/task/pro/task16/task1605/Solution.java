package com.javarush.task.pro.task16.task1605;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Карманный телепорт
*/

public class Solution {

    public static final String INVENTED = "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!";
    public static final String NOT_INVENTED = "Извините, телепорт еще не изобрели, приходите через 10 лет.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //напишите тут ваш код
        while (true){
            if (isTeleportInvented(currentDay) == false){
                currentDay.add(Calendar.YEAR, 10);
            }
            else{
                break;
            }
        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        //напишите тут ваш код
        if (currentDay.after(INVENTION_DAY)){
            System.out.println(INVENTED);
            return true;
        }
        else if (currentDay.before(INVENTION_DAY))
        {
            System.out.println(NOT_INVENTED);
            return false;
        }

        return false;
    }
}
