package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)))){
            while (reader.ready()){
                allLines.add(reader.readLine());
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try (BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)))){
            while (reader2.ready()){
                forRemoveLines.add(reader2.readLine());
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try {
            Solution sol = new Solution();
            sol.joinData();
        }
        catch (CorruptedDataException e){

        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
