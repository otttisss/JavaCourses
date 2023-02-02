package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перемещение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        DirectoryStream<Path> source = Files.newDirectoryStream(sourceDirectory);
        for (Path path : source){
            if (Files.isRegularFile(path)){
                Path targetFile = targetDirectory.resolve(path.getFileName());
                Files.move(path, targetFile);
            }
        }
    }
}

