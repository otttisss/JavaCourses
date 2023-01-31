package com.javarush.task.pro.task14.task1411;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;

/* 
Распаковка исключений
*/

public class Solution {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause instanceof FileSystemException){
                FileSystemException exp = (FileSystemException) cause;
                System.out.println(FAILED_TO_WRITE);
            }
            else if (cause instanceof FileNotFoundException){
                FileNotFoundException exp = (FileNotFoundException) cause;
                System.out.println(FAILED_TO_READ);
            }
//            throw new RuntimeException(e);

        }
        //напишите тут ваш код

    }
}
