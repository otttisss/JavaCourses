package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишите тут ваш код
        SpecialThread th1 = new SpecialThread();
        SpecialThread th2 = new SpecialThread();
        SpecialThread th3 = new SpecialThread();
        SpecialThread th4 = new SpecialThread();
        SpecialThread th5 = new SpecialThread();

        Thread thread1 = new Thread(th1);
        Thread thread2 = new Thread(th2);
        Thread thread3 = new Thread(th3);
        Thread thread4 = new Thread(th4);
        Thread thread5 = new Thread(th5);

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
