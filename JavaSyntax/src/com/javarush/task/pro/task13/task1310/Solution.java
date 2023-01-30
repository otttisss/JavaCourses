package com.javarush.task.pro.task13.task1310;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* 
Успеваемость студентов-2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        //напишите тут ваш код
        for (String key : grades.keySet()){
            Double map = grades.get(key);
            System.out.println(key);
        }
    }

    public static Double getAverageMark() {
        //напишите тут ваш код
        Double sum = 0.0;
        Double count = 0.0;

        for (String key : grades.keySet()){
            Double value = grades.get(key);
            sum += value;
            count++;
        }

        Double avg = sum / count;

        return avg;
    }
}
