package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        System.out.println();
        t2.printResult();
    }
    public static class Read3Strings extends Thread{
        public String[] list = new String[3];

        @Override
        public void run(){
            try {
                for (int i = 0; i < 3; i++) {
                    list[i] = reader.readLine();
                }
            }
            catch (IOException e) {

            }
        }
        public void printResult(){
            for (String print : list){
                System.out.print(print + " ");
            }
        }
    }
}
