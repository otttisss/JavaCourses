package com.javarush.task.pro.task15.task1504;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


        try (Scanner scanner = new Scanner(System.in);InputStream input = Files.newInputStream(Path.of(scanner.nextLine()));
             OutputStream output = Files.newOutputStream(Path.of(scanner.nextLine()))) {
          byte[] read = input.readAllBytes();
            for (int i = 0; i < read.length - 2; i += 2) {
                if (read.length % 2 != 0 && i == read.length - 1)
                    break;
                byte a = read[i];
                read[i] = read[i + 1];
                read[i + 1] = a;
            }
            output.write(read);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

