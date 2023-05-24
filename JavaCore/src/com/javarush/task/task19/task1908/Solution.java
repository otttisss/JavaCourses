package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));
        while (fileReader.ready()) {
            String str = fileReader.readLine();
            String[] num = str.split("\\s");

            try {
                for (String out : num) {
                    if (out.matches("\\d*"))
                        fileWriter.write(out + " ");
                }
            } catch (NumberFormatException e) {
                continue;
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}

///Users/otttisss/Desktop/java_rush_tasks/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1908/test
///Users/otttisss/Desktop/java_rush_tasks/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1908/out

