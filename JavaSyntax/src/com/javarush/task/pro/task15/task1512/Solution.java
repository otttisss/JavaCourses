package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.PreparedStatement;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        try {
            Scanner scanner = new Scanner(System.in);
            printSomething(scanner.nextLine());
            StringBuilder result = new StringBuilder(outputStream.toString());
            outputStream.reset();
            stream.print(result.reverse());
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}