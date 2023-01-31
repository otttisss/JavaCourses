package com.javarush.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.rmi.server.ExportException;

/* 
Оборачивание исключений
*/

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
//        FileUtils.readFile(sourceFile);
//        FileUtils.writeFile(destinationFile);
        //напишите тут ваш код
        try{
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (FileSystemException e){
            throw new RuntimeException(e);
        }
    }
}
