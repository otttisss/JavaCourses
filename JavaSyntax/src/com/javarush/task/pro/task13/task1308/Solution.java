package com.javarush.task.pro.task13.task1308;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 3
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
//        Integer minimum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) < minimum) {
//                minimum = list.get(i);
//            }
//        }
//        return minimum;
        int min = Collections.min(list);
        return (min);
    }

    public static Integer max(ArrayList<Integer> list) {
//        Integer maximum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) > maximum) {
//                maximum = list.get(i);
//            }
//        }
//        return maximum;
        int max = Collections.max(list);
        return max;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = 0;
        frequency = Collections.frequency(list, element);

        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        int index = 0;
        Collections.sort(list);

        index = Collections.binarySearch(list, key);

        return index;
    }
}
