package com.javarush.task.task31.task3102;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Stack;
import java.io.File;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> result = new ArrayList<>();
        Stack<File> filesInStack = new Stack<File>();

        filesInStack.push(new File(root));
        while (!filesInStack.empty()) {
            File current = filesInStack.pop();

            if (current.isDirectory()) {
                for (File file : current.listFiles()) {
                    filesInStack.push(file);
                }
            }
            if (current.isFile()) {
                result.add(current.getAbsolutePath());
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        List<String> fileList = getFileTree("/Users/otttisss/Desktop/java_rush_tasks/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31");
        for (String result : fileList) {
            System.out.println(result);
        }
    }
}
