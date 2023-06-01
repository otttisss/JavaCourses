package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();
    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
//        properties.clear();
        Properties properties = new Properties();

        for (Map.Entry<String, String> values : runtimeStorage.entrySet()) {
            properties.put(values.getKey(), values.getValue());
        }
        properties.store(outputStream, "");
    }
    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        Properties properties = new Properties();
        properties.load(inputStream);

        for (Map.Entry<Object, Object> values : properties.entrySet()) {
            runtimeStorage.put(values.getKey().toString(), values.getValue().toString());
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
