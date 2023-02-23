package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код
    static
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }
        catch (IOException e){
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String filename;
        private ArrayList<String> list = new ArrayList<>();

        @Override
        public void run(){
            try{
                BufferedReader reader = new BufferedReader(new FileReader(filename));

                while(reader.ready()){
                    list.add(reader.readLine());
                }
                reader.close();
            }
            catch (IOException e){

            }
        }
        @Override
        public void setFileName(String fullFileName){
            this.filename = fullFileName;
        }
        @Override
        public String getFileContent(){
            StringBuffer buffer = new StringBuffer();
            for (String ret : list){
                buffer.append(ret).append(" ");
            }
            return buffer.toString();
        }
    }
}
