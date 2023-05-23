package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String file = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        bufferedReader.close();

        FileReader reader = new FileReader(file);
        FileWriter writer = new FileWriter(file2);

        int i = 1;
        while (reader.ready()) {
            int temp = reader.read();
            if (i % 2 == 0) {
                writer.write(temp);
            }
            i++;
        }
        reader.close();
        writer.close();
    }
}
