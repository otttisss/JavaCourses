package com.javarush.task.pro.task15.task1503;

//import com.sun.net.httpserver.Request;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Если ресурсов много
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = null;
//        BufferedReader bufferedReader = null;
        try(Scanner scanner = new Scanner(System.in) ;
            BufferedReader bufferedReader = Files.newBufferedReader(Path.of(scanner.nextLine()))) {

//            String fileName = scanner.nextLine();
//            bufferedReader = Files.newBufferedReader(Path.of(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}

