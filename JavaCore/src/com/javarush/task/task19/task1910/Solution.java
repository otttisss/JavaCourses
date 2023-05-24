package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();
        String file2 = reader.readLine();

        reader.close();

        BufferedReader readFile = new BufferedReader(new FileReader(file));
        BufferedWriter writeFile = new BufferedWriter(new FileWriter(file2));

        while (readFile.ready()) {
            String str = readFile.readLine();
            writeFile.write(str.replaceAll("[\\p{Punct}\\n]", ""));
        }
        readFile.close();
        writeFile.close();
    }
}
