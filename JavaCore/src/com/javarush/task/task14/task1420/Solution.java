package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        if (first <= 0 || second <= 0){
            throw new Exception();
        }
        int max = Math.max(first, second);
        for (int i = max; i > 0 ; i--) {
            if (first % i == 0 && second % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
