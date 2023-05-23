package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }
        @Override
        public Person read() throws IOException {
            Person person = null;

            if (fileScanner.hasNext()) {
                String str = fileScanner.nextLine();
                String space[] = str.split(" ");
                String firstName = space[1];
                String middleName = space[2];
                String lastName = space[0];

                Calendar date = new GregorianCalendar(Integer.parseInt(space[5]), Integer.parseInt(space[4]) - 1, Integer.parseInt(space[3]));

                person = new Person(firstName, middleName, lastName, date.getTime());
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
