package com.javarush.task.pro.task17.task1707;

public class Dog extends Pet {
    public static final String DOG = "Я люблю людей.";

    //напишите тут ваш код
    public void printInfo(){
        super.printInfo();
        System.out.println(DOG);
    }

}
