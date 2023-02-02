package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишите тут ваш код
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try (OutputStream output = connection.getOutputStream();
        InputStream input = connection.getInputStream()){

            output.write(10);
            byte[] buffer = input.readAllBytes();
            String data = new String(buffer);
            System.out.println(data);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

