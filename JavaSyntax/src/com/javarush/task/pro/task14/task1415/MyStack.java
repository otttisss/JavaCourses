package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        //напишите тут ваш код
        storage.add(0, s);
    }

    public String pop() {
        //напишите тут ваш код
        return storage.remove(0);
    }

    public String peek() {
        //напишите тут ваш код
        return storage.get(0);
    }

    public boolean empty() {
        //напишите тут ваш код
        if (storage.isEmpty())
            return true;
        else
            return false;
    }

    public int search(String s) {
        //напишите тут ваш код
        if (storage.contains(s))
            return storage.indexOf(s);
        else
            return -1;
    }
}
