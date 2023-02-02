package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.net.URL;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://catfact.ninja/fact");
        //напишите тут ваш код
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();

        String str = new String(buffer);
        System.out.println(str);
    }
}