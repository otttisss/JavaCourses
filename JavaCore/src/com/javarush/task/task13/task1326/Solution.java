package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        ArrayList<Integer> chisla = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in);
        FileInputStream stream = new FileInputStream(scanner.nextLine());
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream))){
            while (reader.ready()){
                int k = Integer.parseInt(reader.readLine().trim());
                if (k % 2 == 0)
                    chisla.add(k);
            }
            Collections.sort(chisla);
            for (Integer i : chisla){
                System.out.println(i);
            }
        }
    }
}
