package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = "";
//        try{
//            while(!(line = reader.readLine()).equals("exit")){
//                if (line.contains(".")){
//                    Double d = Double.parseDouble(line);
//                    print(d);
//                }
//                else {
//                    int i = Integer.parseInt(line);
//                    if (i > 0 && i < 128) {
//                        print((short) i);
//                    } else {
//                        print(i);
//                    }
//                }
//            }
//        }catch (Exception e){
//            print(line);
//        }
//        reader.close();
        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader reader = new BufferedReader(input)) {
            String read;
            while (!(read = reader.readLine()).equals("exit")){
                // "-?" - либо есть знак минус либо нет
                // "\\d+" - обозначает любое колличество символов
                // "[.]" - обозначет обязательное присутствие точки
                if (read.matches("-?\\d+[.]\\d+")) {
                    print(Double.parseDouble(read));
                    // "-?" - либо есть знак минус либо нет
                    // "\\d+" - обозначает любое колличество символов
                } else if (read.matches("-?\\d+")) {
                    int a = Integer.parseInt(read);
                    // проверка входит ли число в заданное условие от 1 до 127 (включительно)
                    if (a > 0 && a < 128) {
                        print((short) a);
                    } else {
                        print(a);
                    }
                } else {
                    print(read);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
