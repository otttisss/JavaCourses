package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();
        reader.close();

//        FileReader fileReader = new FileReader(file);
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        int i = 0;
        String word = "world";
        while (fileReader.ready()) {
            String line = fileReader.readLine();
//            String[] words = Integer.toString(line).split("\\W");
            String[] words = line.toString().split("\\W");
            for (String s : words) {
                if (s.equals(word))
                    i++;
            }
        }
        fileReader.close();
        System.out.println(i);
    }
}

///Users/otttisss/Desktop/java_rush_tasks/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1907/test
