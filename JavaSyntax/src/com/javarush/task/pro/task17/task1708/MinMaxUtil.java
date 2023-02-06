package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public static int min(int a, int b){
        return Math.min(a, b);
    }
    public static int min(int a, int b, int c){
        return Math.min(min(a, b), c);
    }
    public static int min(int a, int b, int c, int d){
        return Math.min(min(a, b, c), d);
    }
    public static int min(int a, int b, int c, int d, int e){
        return Math.min(min(a, b, c, d), e);
    }

    public static int max(int a, int b){
        return Math.max(a, b);
    }
    public static int max(int a, int b, int c){
        return Math.max(max(a, b), c);
    }
    public static int max(int a, int b, int c, int d){
        return Math.max(max(a, b, c), d);
    }
    public static int max(int a, int b, int c, int d, int e){
        return Math.max(max(a, b, c, d), e);
    }

}
