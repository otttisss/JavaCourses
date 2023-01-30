package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }


    public static void addStudents() {
        grades.put("Ефим Отис", 5.0);
        grades.put("Лера Сито", 3.0);
        grades.put("Афоня Егоров", 4.0);
        grades.put("Ложе Верблюдов", 3.5);
        grades.put("Офигел Ивстал", 2.0);
    }
}
