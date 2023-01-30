package com.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;

/* 
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
//        HashMap<ArrayList<Integer>, String> programmingLanguages = new HashMap<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        HashMap<Integer, String> map = new HashMap<>();
//        for (String index : programmingLanguages) {
//            Integer key = index.indexOf(index);
//            map.put(key, programmingLanguages.get(key));
//        }
        for (int i = 0; i < programmingLanguages.size(); i++) {
            map.put(i, programmingLanguages.get(i));
        }
        return map;
    }

}
