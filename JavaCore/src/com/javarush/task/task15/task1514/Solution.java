package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(10.0, "Hello");
        labels.put(11.0, "World");
        labels.put(12.0, "!");
        labels.put(13.0, "No");
        labels.put(14.0, "Way");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
