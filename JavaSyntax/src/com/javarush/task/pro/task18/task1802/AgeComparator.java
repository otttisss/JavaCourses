package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student>{
    //напишите тут ваш код
    @Override
    public int compare(Student student1, Student student2){
        int stComp = 0;
        if (student1.getAge() > student2.getAge())
            stComp = student2.getAge() - student1.getAge();
        else if (student1.getAge() < student2.getAge())
            stComp = student2.getAge() - student1.getAge();
        else if (student1.getAge() == student2.getAge()) {
            stComp = 0;
        }
        return stComp;
    }
}
