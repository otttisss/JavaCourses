package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        FileInputStream stream = new FileInputStream(scanner.nextLine());
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        while (reader.ready()){
            System.out.println(reader.readLine());
        }
        stream.close();
        reader.close();
    }
}

