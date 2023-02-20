package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] words = url.substring(url.lastIndexOf("?") + 1).split("&");

        for (String str : words){
            if (str.contains("=")){
                System.out.print(str.substring(0, str.lastIndexOf("=")) + " ");
            }else{
                System.out.print(str + " ");
            }
        }
        System.out.println();
        for (String str : words){
            if (str.contains("obj")){
                String line = str.substring(str.indexOf("=") + 1);
                try{
                    alert(Double.parseDouble(line));
                }
                catch (NumberFormatException e){
                    alert(line);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
