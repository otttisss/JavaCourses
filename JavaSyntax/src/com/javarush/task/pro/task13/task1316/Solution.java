package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] j = JavarushQuest.values();
        for (int i = 0; i < JavarushQuest.values().length; i++) {
            System.out.println(j[i].ordinal());
        }
    }
}
