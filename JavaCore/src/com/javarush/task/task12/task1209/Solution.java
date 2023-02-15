package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int a, int b){
        int min = a < b ? a : b;
        return min;
    }

    public static long min(long a, long b){
        long min = a < b ? a : b;
        return min;
    }
    public static double min(double a, double b){
        double min = a < b ? a : b;
        return min;
    }
}
